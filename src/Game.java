import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BATTLE ARENA ===");
        System.out.print("Podaj swoje imię: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        player.selectCharacter();

        Enemy enemy = new Enemy("Goblin");

        System.out.println("\nRozpoczyna się walka " + player.getCharacter().getName() +
                " vs " + enemy.getName() + "!\n");

        while (player.getCharacter().isAlive() && enemy.isAlive()) {
            System.out.println("Naciśnij ENTER, aby zaatakować.");
            scanner.nextLine();

            player.getCharacter().attack(enemy);
            if (!enemy.isAlive()) {
                System.out.println("Pokonałeś przeciwnika!");
                break;
            }

            enemy.attack(player.getCharacter());
            if (!player.getCharacter().isAlive()) {
                System.out.println("Zostałeś pokonany!");
            }
        }

        System.out.println("\n=== KONIEC GRY ===");
    }
}
