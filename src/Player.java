
 //** Klasa reprezentująca gracza — wybiera i przechowuje swoją postać.

import java.util.Scanner;

public class Player {

    private String playerName;
    private Character character;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void selectCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz klasę postaci:");
        System.out.println("1. Wojownik");
        System.out.println("2. Mag");
        System.out.println("3. Łucznik");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> character = new Warrior(playerName);
            case 2 -> character = new Mage(playerName);
            case 3 -> character = new Archer(playerName);
            default -> {
                System.out.println("Nieprawidłowy wybór, wybrano Wojownika.");
                character = new Warrior(playerName);
            }
        }

        System.out.println("Wybrałeś klasę: " + character.getClass().getSimpleName());
    }

    public Character getCharacter() {
        return character;
    }
}
