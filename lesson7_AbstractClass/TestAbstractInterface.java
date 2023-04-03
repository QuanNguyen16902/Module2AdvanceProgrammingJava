package lesson7_AbstractClass;

public class TestAbstractInterface {
        public static void main(String[] args) {
            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Orange();
            fruits[1] = new Apple();
            for (Fruit fruit : fruits) {
                fruit.howtoEat() ;
            }
        }
}
