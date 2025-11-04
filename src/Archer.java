
// ** Klasa reprezentująca Łucznika, zadaje mniejsze, ale bardziej stabilne obrażenia.

import java.util.Random;

public class Archer extends Character {

    private static final Random random = new Random();

    public Archer(String name) {
        super(name, 90, 18);
    }

    @Override
    public void attack(Attackable target) {
        int arrowDamage = attackPower + random.nextInt(6);
        System.out.println(name + " strzela z łuku!");
        target.takeDamage(arrowDamage);
    }
}
