package com.company;

import com.company.Utils.Consts;

public class VwPassat extends SellingTemplate {

    @Override
    double calculateCarPrice(int basePrice) {
        return basePrice * Consts.STANDART_EQUIPMENT_PRICE;
    }
}
