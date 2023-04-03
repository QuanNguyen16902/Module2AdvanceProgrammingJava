package lesson7_AbstractClass.GameAbstractInterface;

public class Garen extends Hero implements IChampion, Itank {
Garen(){

}
    Garen(String name, String role, int attackDamage, int abilityPower, int healthPoints, int manaPoints) {
        super(name, role, attackDamage, abilityPower, healthPoints, manaPoints);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setAttackDamage(Hero hero) {

        hero.healthPoints -= this.attackDamage;
        this.manaPoints -= 20;

    }

    @Override
    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    @Override
    public void displayStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("Attack Damage: " + this.attackDamage);
        System.out.println("Ability Power: " + this.abilityPower);
        System.out.println("Health Points: " + this.healthPoints);
        System.out.println("Mana Points: " + this.manaPoints);
    }

    @Override
    public void ultimateAbility() {
        this.attackDamage = this.attackDamage * 3;
    }

    @Override
    public void Amor() {
        this.healthPoints = this.healthPoints * 2;
    }

}
