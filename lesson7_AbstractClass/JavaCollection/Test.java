package lesson7_AbstractClass.JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Inventory<Product> inventory = new Inventory<>();
        inventory.addProduct(new Book("THe lord of the ring", 29.99,"J.R.R. Tolken", 1178));
        inventory.addProduct(new Book("The hobbit", 12.99,"J.R.R. Tolken", 310));
        inventory.addProduct(new Product("IphoneX" , 999.99));

        inventory.addProduct(new Pen("Ballpoints Pen", 1.99,"red"));
        inventory.addProduct(new Pen("Fountain Pen", 2.99,"blue"));
        inventory.addProduct(new Pen("Gel Pen", 3.99,"gr"));


        List<Product> products = inventory.getProducts();

        for(Product product : products){
            System.out.println("Product name: " + product.getName());
            System.out.println("Product price: " + product.getPrice());
            if(product instanceof Book){
                Book book = (Book) product;
                System.out.println("Book author: " + book.getAuthor());
                System.out.println("Book page count: " + book.getPageCount());
            }
            if(product instanceof Pen){
                Pen p1 = (Pen) product;
                System.out.println("Pen color: "+ p1.getColor());
            }
            System.out.println();
        }
    }
}
