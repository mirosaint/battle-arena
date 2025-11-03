import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warrior player = new Warrior("Gracz");
        Enemy enemy = new Enemy("Goblin");

        System.out.println("=== Rozpoczyna się walka ===");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nTwoja tura! Wciśnij ENTER, aby zaatakować.");
            scanner.nextLine();
            player.attack(enemy);

            if (!enemy.isAlive()) {
                System.out.println("Pokonałeś przeciwnika!");
                break;
            }

            System.out.println("Tura przeciwnika!");
            enemy.attack(player);

            if (!player.isAlive()) {
                System.out.println("Zostałeś pokonany!");
            }
        }

        System.out.println("=== Koniec walki ===");
    }
}
