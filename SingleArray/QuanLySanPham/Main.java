package QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManagementSystem productManagementSystem = new ProductManagementSystem();
        // Thêm mới sản phẩm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bnh product: ");
        int n = scanner.nextInt();
        Product[] products = new Product[n];
        for(int i = 0; i < n ; i++) {
            System.out.println("Enter product id:");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.println("Enter product name:");
            String name = scanner.nextLine();
            System.out.println("Enter product price:");
            float price = scanner.nextFloat();
            scanner.nextLine(); // consume newline character
            System.out.println("Enter product description:");
            String description = scanner.nextLine();
            products[i] = new Product(id, name, price, description);

            productManagementSystem.addProduct(products[i], products);
        }
        productManagementSystem.showProductList(products);
        productManagementSystem.removeProduct(1,products);



    }
}
