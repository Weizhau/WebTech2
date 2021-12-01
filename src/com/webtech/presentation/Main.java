package com.webtech.presentation;

import com.webtech.data.repository.AppliancesRepository;
import com.webtech.data.repository.IAppliancesRepository;

public class Main {

    public static void main(String[] args) {
        IAppliancesRepository repository = new AppliancesRepository("appliances.xml");

        System.out.println(repository.getLowestPriceAppliance());
        System.out.println(repository.getAllTeapots());
    }

}
