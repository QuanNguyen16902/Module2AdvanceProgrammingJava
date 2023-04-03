package lesson7_AbstractClass;

class Chi extends Animal implements Edible {

    @Override
    void makeSound() {
        System.out.println("ò ó o");
    }

    @Override
    public void howtoEat() {
        System.out.println("couble be fried");
    }



}
