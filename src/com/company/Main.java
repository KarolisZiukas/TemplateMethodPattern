package com.company;

import com.company.Utils.Consts;

public class Main {

    public static void main(String[] args) {

        SkodaOctavia skodaOctavia = new SkodaOctavia();
        System.out.println(skodaOctavia.getFinalCarPrice(3000, 60, 3, Consts.BASE_TV_COMMERCIAL_PRICE));
        VwPassat vwPassat = new VwPassat();
        System.out.println(vwPassat.getFinalCarPrice(1000, 60, 3, Consts.BASE_RADIO_COMMERCIAL_PRICE));

    }
}
