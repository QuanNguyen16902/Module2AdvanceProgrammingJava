package ReadFileObj;

import java.io.*;
import java.io.ObjectOutputStream;
public class FileBinary {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.txt"))) {
            Product product = new Product(1, "Iphone12", 2800, "new");
            Product product2 = new Product(2, "Iphone", 2500, "new");
            oos.writeObject(product);
            oos.writeObject(product2);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Success!");
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product = (Product) ois.readObject();
            Product product2 = (Product) ois.readObject();

            System.out.println(product);
            System.out.println(product2);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
class Product implements Serializable{
    @Serial
    private static final long serialVersionUID = -266706354210367639L;
    private int id;
    private String name;
    private double price;
    private String description;

    Product(int id, String name, double price, String description){
        this.id = id ;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String toString(){
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
