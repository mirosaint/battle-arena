# 🎮 Battle Arena

Prosta gra tekstowa napisana w języku **Java**, przedstawiająca turowe pojedynki pomiędzy graczem a przeciwnikiem.  
Projekt został wykonany zgodnie z zasadami **programowania obiektowego (OOP)** i obejmuje klasy, dziedziczenie, interfejsy, typy wyliczeniowe oraz obsługę błędów.

---

## ⚙️ Funkcjonalność projektu

### 1️⃣ Wybór postaci gracza
Gracz może wybrać jedną z dostępnych klas postaci: **Warrior**, **Mage** lub **Archer**.  
Każda postać posiada inne parametry (`health`, `attackPower`) oraz indywidualny styl walki (`attack()` działa inaczej w zależności od klasy).

---

### 2️⃣ Generowanie przeciwnika
Przeciwnik (**Enemy**) jest generowany automatycznie z losowymi statystykami, co zapewnia różnorodność rozgrywek.

---

### 3️⃣ Rozpoczęcie bitwy
Gra rozpoczyna walkę między graczem a przeciwnikiem.  
Bitwa przebiega w turach (gracz i przeciwnik atakują naprzemiennie).

---

### 4️⃣ Tura gracza
Gracz wykonuje atak za pomocą swojej postaci (`attack()`).  
System sprawdza, czy przeciwnik przeżył atak, a następnie przechodzi do tury przeciwnika.

---

### 5️⃣ Tura przeciwnika
Jeśli przeciwnik żyje, kontratakuje gracza.  
Po każdym ataku system aktualizuje stan zdrowia postaci.

---

### 6️⃣ Zakończenie bitwy
Gra kończy się, gdy gracz **lub** przeciwnik straci wszystkie punkty zdrowia.  
Wyświetlany jest komunikat o zwycięstwie lub przegranej.

---

### 7️⃣ Ponowna rozgrywka
Gracz może rozpocząć **nową grę** bez konieczności restartowania programu.  
Służy do tego metoda `restart()` w klasie `Game`.

---

### 8️⃣ Licznik rozegranych gier
Gra przechowuje statyczną wartość `gamesPlayed`, która jest zwiększana po każdej rozgrywce.  
Umożliwia to śledzenie liczby rozegranych bitew.

---

### 9️⃣ Obsługa błędów
Program wykrywa błędne sytuacje, np. próbę ataku na martwego przeciwnika, i obsługuje je komunikatami błędów.  
Dzięki temu rozgrywka przebiega stabilnie.

---

### 🔟 Wyświetlanie informacji
W każdej turze wyświetlane są:
- aktualne punkty zdrowia gracza i przeciwnika,  
- komunikaty o wykonanych akcjach,  
- wynik końcowy po zakończeniu bitwy.

---

## 🧠 Technologie i zasady OOP
Projekt wykorzystuje:
- dziedziczenie (np. `Warrior`, `Mage`, `Archer` dziedziczą po `Character`)
- interfejs (`Attackable`)
- klasę abstrakcyjną (`Character`)
- typ wyliczeniowy (`CharacterType`)
- pola i metody statyczne (`Game.gamesPlayed`)
- hermetyzację (pola prywatne, gettery i settery)
- obsługę błędów (`try/catch`)
