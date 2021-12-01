package com.webtech.data.repository;

import com.webtech.domain.model.Appliance;
import com.webtech.data.parser.ApplianceXmlParser;

import java.util.Comparator;
import java.util.List;

/**
 * Repository for appliances xml document
 * Implements {@link IAppliancesRepository}
 *
 * @author Maksim Malenho
 * @version 1.0
 */
public class AppliancesRepository implements IAppliancesRepository {

    /**
     * Field uri - uri to xml-doc for {@link AppliancesRepository}
     */
    private final String uri;

    /**
     * @param uri uri
     */
    public AppliancesRepository(String uri){
        this.uri = uri;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getApplianceList() {
        ApplianceXmlParser parser = new ApplianceXmlParser();
        return parser.parseXml(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> getAllTeapots() {
        return getApplianceList().stream().filter(it -> it.getType().equals("teapot")).toList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance getLowestPriceAppliance() {
        List<Appliance> list = getApplianceList();
        if (list.isEmpty()) {
            return null;
        }

        return list.stream().min(Comparator.comparingDouble(Appliance::getPrice)).get();
    }

}
