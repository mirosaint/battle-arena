import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("=== BATTLE ARENA ===");

        while (playAgain) {
            System.out.print("\nPodaj swoje imię: ");
            String name = scanner.nextLine();

            Player player = new Player(name);
            player.selectCharacter();

            Enemy enemy = GameUtils.generateRandomEnemy();
            Battle battle = new Battle(player.getCharacter(), enemy);
            battle.start();

            GameUtils.incrementGamesPlayed();

            System.out.println("\nRozegrane gry: " + GameUtils.gamesPlayed);
            System.out.print("Czy chcesz zagrać ponownie? (t/n): ");
            playAgain = scanner.nextLine().equalsIgnoreCase("t");
        }

        System.out.println("\nDziękujemy za grę!");
    }
}

