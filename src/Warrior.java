
// ** Wojownik zadaje stałe obrażenia bazowe.

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack(Attackable target) {
        System.out.println(name + " uderza mieczem!");
        target.takeDamage(attackPower);
    }
}
