
// ** Klasa reprezentująca Maga, zadaje losowe obrażenia o większym zakresie.

import java.util.Random;

public class Mage extends Character {

    private static final Random random = new Random();

    public Mage(String name) {
        super(name, 80, 15);
    }

    @Override
    public void attack(Attackable target) {
        int spellDamage = attackPower + random.nextInt(15);
        System.out.println(name + " rzuca zaklęcie ognia!");
        target.takeDamage(spellDamage);
    }
}
