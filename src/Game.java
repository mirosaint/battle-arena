/**
 * Prosty test klasy Warrior
 */
public class Game {
    public static void main(String[] args) {
        Warrior player = new Warrior("Gracz");
        Warrior enemy = new Warrior("Przeciwnik");

        System.out.println("=== Początek testowej walki ===");

        player.attack(enemy);
        enemy.attack(player);
    }
}