package lesson7_AbstractClass.JavaCollection;

public class Pen extends Product {
    private String color;

    public Pen(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
