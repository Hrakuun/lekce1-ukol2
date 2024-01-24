package com.engeto.ukol2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Vendor carrotVendor = new Vendor("Karel Novák", LocalDate.of(1974,11,23),4,13.4,"Znojmo", "3BK2345", 17, "92.22.31.8");
        System.out.printf("Průměrné množství prodané mrkve na jednu smlouvu je: %s t%n", carrotVendor.averageCarrotSoldPerContract());

    }
}
