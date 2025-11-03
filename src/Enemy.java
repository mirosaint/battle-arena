import java.util.Random;

// ** Klasa reprezentująca przeciwnika.

public class Enemy extends Character {

    private static final Random random = new Random();

    public Enemy(String name) {
        super(name, 80 + random.nextInt(40), 10 + random.nextInt(10));
    }

    @Override
    public void attack(Attackable target) {
        System.out.println(name + " atakuje gracza!");
        target.takeDamage(attackPower);
    }
}
