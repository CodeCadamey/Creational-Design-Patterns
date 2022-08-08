package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Laptop;
import Creational.AbstractFactory.Entity.LaptopDell;
import Creational.AbstractFactory.LaptopFactory;

public class DellFactory implements LaptopFactory {
    @Override
    public Laptop getLaptop(String brand, String model, String year) {
        return new LaptopDell(brand, model, year);
    }
}
