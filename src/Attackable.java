public interface Attackable {
    /**
     * Metoda odpowiadająca za zadanie obrażeń celowi.
     * @param damage ilość obrażeń
     */
    void takeDamage(int damage);

    /**
     * Sprawdza, czy obiekt wciąż żyje (ma HP > 0).
     * @return true jeśli żyje
     */
    boolean isAlive();
}
