package com.company;

import com.company.Utils.MinutesHelper;

abstract public class SellingTemplate {

    final double getFinalCarPrice(int basePrice, int duration, int numberOfDays, int commercialType) {
        return calculateCarPrice(basePrice) +
                calculateInsurancePrice(basePrice) +
                calculateMarketingPrice(duration, numberOfDays, commercialType);
    }

    abstract double calculateCarPrice(int basePrice);

    double calculateMarketingPrice(int duration, int numberOfDays, int commercialType) {
        return commercialType * MinutesHelper.getDurationInMinutes(duration) * numberOfDays;
    }

    double calculateInsurancePrice(int basePrice) {
        return 0;
    }



}
