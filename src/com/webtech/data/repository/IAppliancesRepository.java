package com.webtech.data.repository;

import com.webtech.domain.model.Appliance;

import java.util.List;

public interface IAppliancesRepository {

    List<Appliance> getApplianceList();

    List<Appliance> getAllTeapots();

    Appliance getLowestPriceAppliance();

}
