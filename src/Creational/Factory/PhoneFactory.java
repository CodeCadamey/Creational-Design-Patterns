package Creational.Factory;

public class PhoneFactory {

    public static Phone getPhone(String brand,
                                 String model,
                                 String year,
                                 Integer capacity,
                                 Integer ramCapacity,
                                 PhoneBrand phoneBrand) {
        Phone phone;
        if (PhoneBrand.IPhone == phoneBrand) {
            phone = new IPhone(brand, model, year, capacity, ramCapacity, phoneBrand);
        } else if (PhoneBrand.Samsung == phoneBrand) {
            phone = new Samsung();
        } else {
            throw new RuntimeException("phone brand cannot be found!");
        }
        return phone;
    }
}
