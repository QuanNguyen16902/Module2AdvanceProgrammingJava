package lesson7_AbstractClass.JavaCollection.RealEstate;

import java.util.ArrayList;
import java.util.List;

public class Condotel extends RealEstate{
    private int capacity;

    public Condotel(String address, int bedrooms, int bathrooms, double price, int capacity){
        super(address, bedrooms, bathrooms, price);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public String toString(){
        return super.toString() + ", Capacity: "+ capacity;
    }

    public static void main(String[] args) {
        RealEstate codotel1 = new Condotel("123 Main st", 2, 3, 50000.50, 6);
        RealEstate codotel2 = new Condotel("456 Main st", 2, 3, 50000.50, 6);
        RealEstate codotel3 = new Condotel("789 Main st", 1, 2, 90.000, 2);
        RealEstate realEstatesss = new RealEstate("87" , 6,7,60000);

        RealEstateListing<RealEstate> lists = new RealEstateListing<>();
        lists.addListing(codotel1);
        lists.addListing(codotel2);
        lists.addListing(codotel3);
        lists.addListing(realEstatesss);

        List<RealEstate> listing = lists.getListings();

        for(RealEstate realEstate : listing){
            System.out.println("Address: " + realEstate.getAddress());
            System.out.println("Bedrooms: " + realEstate.getBedrooms());
            System.out.println("Bathrooms: " + realEstate.getBathrooms());
            System.out.println("Price: " + realEstate.getPrice());
            if(realEstate instanceof  Condotel) {
                Condotel condotel = (Condotel) realEstate;
                System.out.println("Capacity: " + condotel.getCapacity());
            }
            System.out.println();
        }

    }
}
