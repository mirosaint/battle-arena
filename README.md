# battle-arena
1. Wybór postaci gracza
Gracz może wybrać jedną z dostępnych klas postaci: Warrior, Mage lub Archer.
Każda postać ma inne parametry (health, attackPower) i styl walki (attack() działa inaczej).

2. Generowanie przeciwnika
Przeciwnik (Enemy) jest generowany automatycznie z losowymi statystykami.

3. Rozpoczęcie bitwy
Gra rozpoczyna walkę między graczem a przeciwnikiem.
Bitwa toczy się w turach (naprzemienne ataki).

4. Tura gracza
Gracz wykonuje atak za pomocą swojej postaci (attack()).
System sprawdza, czy przeciwnik przeżył atak.

5. Tura przeciwnika
Jeśli przeciwnik żyje, kontratakuje gracza.
System aktualizuje zdrowie postaci.

6. Zakończenie bitwy
Gra kończy się, gdy gracz lub przeciwnik traci wszystkie punkty zdrowia.
Wyświetlany jest wynik (zwycięstwo lub przegrana).

7. Ponowna rozgrywka
Gracz może rozpocząć nową grę bez konieczności restartowania programu (restart() w klasie Game).

8. Licznik rozegranych gier
Gra przechowuje statyczną wartość gamesPlayed, zwiększaną po każdej rozgrywce.

9. Obsługa błędów
Program wykrywa błędne sytuacje, np. atak na martwego przeciwnika, i obsługuje je komunikatem błędu.

10. Wyświetlanie informacji
W każdej turze wyświetlane są informacje o stanie zdrowia gracza i przeciwnika.
