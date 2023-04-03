package inheritance;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }
    public Rectangle(double width,double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getParameter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width ="
                + this.width + " and length = "
                + this.length + ", which is a subclass of "
                + super.toString();
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8, "red",false);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//    }
}
