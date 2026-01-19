
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
        int choice = -1;

        System.out.println("Wybierz swoją postać:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Archer");

        while (true) {
            try {
                System.out.print("Twój wybór (1-3): ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("❌ Błąd! Musisz wybrać liczbę od 1 do 3.");
                }

            } catch (Exception e) {
                System.out.println("❌ Błąd! Musisz wpisać liczbę.");
                scanner.nextLine();
            }
        }

        switch (choice) {
            case 1 -> character = new Warrior("Warrior");
            case 2 -> character = new Mage("Mage");
            case 3 -> character = new Archer("Archer");
        }

        System.out.println("✅ Wybrałeś postać: " + character.getName());
    }

    public Character getCharacter() {
        return character;
    }
}
