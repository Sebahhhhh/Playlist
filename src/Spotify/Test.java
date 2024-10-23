package Spotify;

public class Test {
    public static void main(String[] args) {

        // Oggetti
        Playlist playlist = new Playlist();

        // 3 canzoni
        Canzone canzone1 = new Canzone("DoWhile", "Panseri", 89);
        playlist.aggiungiCanzone(canzone1);

        playlist.aggiungiCanzone("Hai 1 euro?", "Pica", 104);
        playlist.aggiungiCanzone("Apri la Bocca", "Pica", 69);

        // Quante canzoni ci sono
        System.out.println("Numero di canzoni nella playlist: " + playlist.numeroCanzoni());

        // Toglierne una
        playlist.cancellaCanzone(canzone1);
        System.out.println("Numero di canzoni dopo cancellazione: " + playlist.numeroCanzoni());

        // Ricerca del canzone dal cantante
        Canzone[] C1 = playlist.ricercaCanzoni("Pica");
        System.out.println("Canzoni di Pica: ");
        for (Canzone c : C1) {
            System.out.println(c);
        }

        // Ricercare un cantante dato il nome di una canzone
        System.out.println("Cantante della canzone 'Test': " + playlist.ricercaCantante("DoWhile"));
    }
}
