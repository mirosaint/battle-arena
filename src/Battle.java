import java.util.Scanner;

/**
 * Klasa odpowiedzialna za przebieg walki pomiędzy graczem a przeciwnikiem.
 */
public class Battle {

    private final Character player;
    private final Enemy enemy;
    private final Scanner scanner = new Scanner(System.in);

    public Battle(Character player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {
        System.out.println("\n=== WALKA ROZPOCZĘTA ===");
        System.out.println(player.getName() + " vs " + enemy.getName());

        while (player.isAlive() && enemy.isAlive()) {
            playerTurn();
            if (!enemy.isAlive()) {
                System.out.println("🎉 Zwycięstwo!");
                break;
            }

            enemyTurn();
            if (!player.isAlive()) {
                System.out.println("Przegrałeś!");
            }
        }

        System.out.println("=== KONIEC WALKI ===");
    }

    private void playerTurn() {
        System.out.println("\nTwoja tura (ENTER aby zaatakować)");
        scanner.nextLine();
        player.attack(enemy);
    }

    private void enemyTurn() {
        System.out.println("\nTura przeciwnika!");
        enemy.attack(player);
    }
}
