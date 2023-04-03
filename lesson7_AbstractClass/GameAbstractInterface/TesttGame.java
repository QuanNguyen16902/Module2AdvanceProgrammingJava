package lesson7_AbstractClass.GameAbstractInterface;

import java.util.Queue;
import java.util.Stack;

public class TesttGame {
    public static void main(String[] args) {

        Garen garen = new Garen("Garen", "Top", 50, 30, 100, 100);
        garen.displayStats();
        System.out.println();
        Lux lux = new Lux("Lux", "Mid", 30, 50, 70, 200);
        lux.displayStats();
        System.out.println();
        lux.setAttackDamage(garen);

        lux.displayStats();
        System.out.println();
        garen.displayStats();
        System.out.println();
        garen.Amor();
        garen.displayStats();

//        Hero[] heroes = new Hero[2];
//        heroes[0] = new Garen();
//        heroes[1] = new Lux();
//        for(Hero hero : heroes){
//            System.out.println(hero);
//        }
    }
}
