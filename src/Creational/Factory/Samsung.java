package Creational.Factory;

public class Samsung implements Phone {

    private String brand;
    private String model;
    private String year;
    private Integer capacity;
    private Integer ramCapacity;
    PhoneBrand phoneBrand;

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

    @Override
    public PhoneBrand getPhoneBrand() {
        return phoneBrand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
