package Creational.Factory;

public class Test {

    public static void main(String[] args) {
        Phone iPhone = PhoneFactory.
                getPhone("IPhone", "14 Pro Max", "2022", 128, 8, PhoneBrand.IPhone);

        System.out.println("my phone " + iPhone.getBrand() );
    }
}
