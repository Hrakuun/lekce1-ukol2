package com.engeto.ukol2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;

public class Vendor {

    private String name;
    private LocalDate birthdate;
    private int numberOfContracts;
    private int soldCarrotsTons;
    private String city;
    private String carRegistrationPlate;
    private double fuelConsumption; // l/100km
    private InetAddress ipAdress;

    /**
     * @param name Jméno a příjmení prodejce
     * @param birthdate datum narození prodejce ve formátu rok, měsíc, den
     * @param numberOfContracts Počet dosud sjednaných smluv
     * @param soldCarrotsTons Celkové množství prodané mrkve v tunách
     * @param city jméno města kde prodejce sídlí
     * @param carRegistrationPlate registrační značka vozidla prodejce (SPZ)
     * @param fuelConsumption spotřeba firemního vozidla v litrech na 100 km
     * @param ipAdress IP adresa firemního počítače prodejce ve formátu IPv4
     */
    public Vendor(String name, LocalDate birthdate, int numberOfContracts, int soldCarrotsTons, String city, String carRegistrationPlate, double fuelConsumption, String ipAdress){
        this.name = name;
        this.birthdate = birthdate;
        this.numberOfContracts = numberOfContracts;
        this.soldCarrotsTons = soldCarrotsTons;
        this.city = city;
        this.carRegistrationPlate = carRegistrationPlate;
        this.fuelConsumption = fuelConsumption;
        try {
            this.ipAdress = InetAddress.getByName(ipAdress);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public double averageCarrotSoldPerContract(){
        return (double)soldCarrotsTons / (double)numberOfContracts;
    }


}
