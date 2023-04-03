package inheritance;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    Shape(){}
    Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public boolean isFilled(){
        return this.filled;
    }


    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//    }
}


