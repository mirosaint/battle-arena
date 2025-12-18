import java.util.Random;

/**
 * Klasa narzędziowa zawierająca metody pomocnicze gry.
 */
public class GameUtils {

    private static final Random random = new Random();
    public static int gamesPlayed = 0;

    public static Enemy generateRandomEnemy() {
        String[] names = {"Goblin", "Ork", "Szkielet", "Bandzior"};
        String name = names[random.nextInt(names.length)];
        return new Enemy(name);
    }

    public static void incrementGamesPlayed() {
        gamesPlayed++;
    }
}
