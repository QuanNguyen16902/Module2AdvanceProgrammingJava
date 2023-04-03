package lesson7_AbstractClass.GameAbstractInterface;

public interface IChampion {
    void setName(String name);

     void setRole(String role);

     void setAttackDamage(Hero attackDamage);

     void setAbilityPower(int abilityPower);

     void setHealthPoints(int healthPoints);

     void setManaPoints(int manaPoints);

     void displayStats();

     void ultimateAbility();
}
