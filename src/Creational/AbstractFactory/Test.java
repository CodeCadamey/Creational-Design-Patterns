package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.AppleFactory;
import Creational.AbstractFactory.Factory.DellFactory;

public class Test {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Laptop appleLaptop = appleFactory.getLaptop("Apple", "Macbook Pro", "2023");

        DellFactory dellFactory = new DellFactory();
        Laptop dellLaptop = dellFactory.getLaptop("Dell", "XPS 13", "2023");
    }
}
