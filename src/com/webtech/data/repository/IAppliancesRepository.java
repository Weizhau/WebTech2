package com.webtech.data.repository;

import com.webtech.domain.model.Appliance;

import java.util.List;

/**
 * Interface for appliance repositories
 *
 * @author Maksim Malenho
 * @version 1.0
 */
public interface IAppliancesRepository {

    /**
     * @return {@link List<Appliance>} all appliances presented in xml-doc
     */
    List<Appliance> getApplianceList();

    /**
     * @return {@link List<Appliance>} All teapots presented in xml-doc
     */
    List<Appliance> getAllTeapots();

    /**
     * @return {@link Appliance} with lowest price parameter
     */
    Appliance getLowestPriceAppliance();

}
