package lesson7_AbstractClass.JavaCollection.RealEstate;

public class RealEstate {
    private String address;
    private int bedrooms;
    private int bathrooms;
    private double price;

    public RealEstate(String address, int bedrooms, int bathrooms, double price) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.price = price;
    }


    public String getAddress() {
        return address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Address: " + address + ", Bedrooms: " + bedrooms + ", Bathrooms: " + bathrooms + ", Price: " + price;
    }
}
