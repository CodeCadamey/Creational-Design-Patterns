package Creational.AbstractFactory.Entity;

import Creational.AbstractFactory.Laptop;

public class LaptopDell implements Laptop {

    private String brand;
    private String model;
    private String year;

    public LaptopDell(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getYear() {
        return year;
    }
}
