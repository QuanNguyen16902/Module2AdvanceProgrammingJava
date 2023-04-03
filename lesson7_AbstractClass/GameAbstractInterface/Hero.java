package lesson7_AbstractClass.GameAbstractInterface;

abstract class Hero {
    public String name;
    String role;
    int attackDamage;
    int abilityPower;
    int healthPoints;
    int manaPoints;
Hero(){

}
    Hero(String name, String role, int attackDamage, int abilityPower, int healthPoints, int manaPoints) {
        this.name = name;
        this.role = role;
        this.attackDamage = attackDamage;
        this.abilityPower = abilityPower;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }
}
