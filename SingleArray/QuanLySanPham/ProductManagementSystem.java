package QuanLySanPham;

import java.util.ArrayList;
public class ProductManagementSystem {
    ArrayList<Product> products;
    public ProductManagementSystem(){
        products = new ArrayList<>();
    }

    public void showProductList(Product [] productList){
        System.out.println("List of Products:");

        for (Product product : productList) {
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Description: " + product.getDescription());
            System.out.println("--------------------------");
        }

    }
    public void addProduct(Product newProduct, Product[] productList){
        Product[] newProductList = new Product[productList.length + 1];

        for(int i = 0 ;i<productList.length; i++){
            newProductList[i] = productList[i];
        }

        newProductList[newProductList.length - 1] = newProduct;

        productList = newProductList;
        System.out.println("Add new product: " + newProduct.getName());
    }

    public void removeProduct(int productId, Product[] productList){
        Product[] newProductList = new Product[productList.length - 1];
        int removeIndex = -1;
        for(int i = 0; i < productList.length; i++){
            if(productList[i].getId() == productId){
                removeIndex = i;
                break;
            }
        }
        if(removeIndex == -1){
            System.out.println("Product with ID " + productId + " not found");
            return;
        }
        int newIndex = 0;
        for(int i = 0 ; i < productList.length; i++){
            if(i != removeIndex){
                newProductList[newIndex] = productList[i];
                newIndex++;
            }
        }

        productList = newProductList;
        System.out.println("Remove product with ID " + productId);

    }
    public Product findProductByName(String name, Product[] productList){
        for(Product product: productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public void sortProductsByName(Product[] productList){
        for(int i = 1 ; i < productList.length; i ++ ){
            Product temp = productList[i];
            int j = i - 1;
            while (j >= 0 && productList[j].getName().compareTo(temp.getName()) > 0){
                productList[j+1] = productList[j];
                j--;
            }
        }
    }

    public void updateProduct(int productId, String newName, double newPrice, Product[] productList){
        int updateIndex = -1;
        for(int i = 0 ; i < productList.length; i++){
            if(productList[i].getId() == productId){
                updateIndex = i;
                break;
            }
        }
        if(updateIndex == -1){
            System.out.println("Product with ID " + productId + " not found");
        }

        productList[updateIndex].setName(newName);
        productList[updateIndex].setPrice(newPrice);
        System.out.println("Update product with ID: " + productId);

    }


}
