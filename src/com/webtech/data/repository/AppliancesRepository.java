package com.webtech.data.repository;

import com.webtech.domain.model.Appliance;
import com.webtech.data.parser.ApplianceXmlParser;

import java.util.Comparator;
import java.util.List;

public class AppliancesRepository implements IAppliancesRepository {

    private final String uri;

    public AppliancesRepository(String uri){
        this.uri = uri;
    }

    @Override
    public List<Appliance> getApplianceList() {
        ApplianceXmlParser parser = new ApplianceXmlParser();
        return parser.parseXml(uri);
    }

    @Override
    public List<Appliance> getAllTeapots() {
        return getApplianceList().stream().filter(it -> it.getType().equals("teapot")).toList();
    }

    @Override
    public Appliance getLowestPriceAppliance() {
        List<Appliance> list = getApplianceList();
        if (list.isEmpty()) {
            return null;
        }

        return list.stream().min(Comparator.comparingDouble(Appliance::getPrice)).get();
    }

}
