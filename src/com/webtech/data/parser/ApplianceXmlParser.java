package com.webtech.data.parser;

import com.webtech.domain.model.Appliance;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.LinkedList;
import java.util.List;

public class ApplianceXmlParser {

    public List<Appliance> parseXml(String uri) {
        List<Appliance> applianceList = new LinkedList<>();

        try {
            DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = docBuilder.parse(uri);

            Node root = document.getDocumentElement();
            NodeList applianceNodeList = root.getChildNodes();

            for (int i = 0; i < applianceNodeList.getLength(); i++) {
                Node applianceNode = applianceNodeList.item(i);
                if (applianceNode.getNodeType() != Node.TEXT_NODE) {
                    Appliance appliance = parseApplianceNode(applianceNode);
                    applianceList.add(appliance);
                }
            }
        } catch (Exception e) {
            return null;
        }

        return applianceList;
    }

    private Appliance parseApplianceNode(Node node) {
        String type = "";
        String name = "";
        float price = 0f;

        NodeList applianceParams = node.getChildNodes();
        for (int i = 0; i < applianceParams.getLength(); i++) {
            Node param = applianceParams.item(i);
            if (param.getNodeType() != Node.TEXT_NODE) {
                switch (param.getNodeName()) {
                    case "type" -> type = param.getChildNodes().item(0).getTextContent();
                    case "name" -> name = param.getChildNodes().item(0).getTextContent();
                    case "price" -> price = Float.parseFloat(param.getChildNodes().item(0).getTextContent());
                }
            }
        }

        return new Appliance(type, name, price);
    }
}
