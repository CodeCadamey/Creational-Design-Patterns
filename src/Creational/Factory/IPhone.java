package Creational.Factory;

public class IPhone implements Phone {

    private String brand;
    private String model;
    private String year;
    private Integer capacity;
    private Integer ramCapacity;
    private PhoneBrand phoneBrand;

    public IPhone() {

    }

    public IPhone(String brand, String model, String year, Integer capacity, Integer ramCapacity, PhoneBrand phoneBrand) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.ramCapacity = ramCapacity;
        this.phoneBrand = phoneBrand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return year;
    }

    @Override
    public String getYear() {
        return null;
    }

    @Override
    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public Integer getRamCapacity() {
        return ramCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public PhoneBrand getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(PhoneBrand phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setRamCapacity(Integer ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
}
