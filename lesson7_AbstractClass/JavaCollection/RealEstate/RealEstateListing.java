package lesson7_AbstractClass.JavaCollection.RealEstate;

import java.util.ArrayList;
import java.util.List;

public class RealEstateListing<T extends RealEstate> {
    private List<T> listings = new ArrayList<>();
    public void addListing(T listing){
        listings.add(listing);
    }

    public boolean removeListing(T listing){
        return listings.remove(listing);
    }
    public boolean containsListing(T listing){
        return listings.contains(listing);
    }

    public List<T> getListings(){
        return listings;
    }

//    public static void main(String[] args) {
//        RealEstate house1 = new RealEstate("123 Main St", 3,2,25000.00);
//        RealEstate condo1 = new RealEstate("456 Elm St", 1,1,125000.00);
//        RealEstate land1 = new RealEstate("789 Oak St", 0,0,50000.00);
//
//
//        RealEstateListing<RealEstate> listing = new RealEstateListing<>();
//        listing.addListing(house1);
//        listing.addListing(condo1);
//        listing.addListing(land1);
//
//        listing.removeListing(condo1);
//        List<RealEstate> listings = listing.getListings();
//        for(RealEstate realEstate: listings){
//            System.out.println(realEstate);
//        }
//
//    }
}
