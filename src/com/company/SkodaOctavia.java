package com.company;

import com.company.Utils.Consts;

public class SkodaOctavia extends SellingTemplate {

    private static final int DAMAGE = 500;

    @Override
    double calculateCarPrice(int basePrice) {
        return basePrice + basePrice * Consts.LUXURY_EQUIPMENT_PRICE - DAMAGE;
    }

    @Override
    double calculateInsurancePrice(int basePrice) {
        return basePrice * Consts.ENSURANCE_PRICE;
    }
}
