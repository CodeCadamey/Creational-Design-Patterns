package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Laptop;
import Creational.AbstractFactory.Entity.LaptopApple;
import Creational.AbstractFactory.LaptopFactory;

public class AppleFactory implements LaptopFactory {
    @Override
    public Laptop getLaptop(String brand, String model, String year) {
        return new LaptopApple(brand, model, year);
    }
}
