package Spotify;

public class Playlist {
    private Canzone[] PList;
    private int nCanzoni;

    // Dimensioni Playlist
    public Playlist() {
        PList = new Canzone[100];
        nCanzoni = 0;
    }

    // Get
    public Canzone[] getPList() {
        return PList;
    }

    // Set
    public void setPList(Canzone[] PList) {
        this.PList = PList;
    }

    // Dice quante ce ne sono
    public int numeroCanzoni() {
        return nCanzoni;
    }

    // Più una canzone
    public void aggiungiCanzone(Canzone canzone) {
        if (nCanzoni < 100) {
            PList[nCanzoni] = canzone;
            nCanzoni++;
        } else {
            System.out.println("Piena");
        }
    }

    // Piu una canzone con parametri
    public void aggiungiCanzone(String nome, String cantante, int durata) {
        Canzone nuovaCanzone = new Canzone(nome, cantante, durata);
        aggiungiCanzone(nuovaCanzone);
    }

    // Eliminazione della canzone
    public void cancellaCanzone(Canzone canzone) {
        for (int i = 0; i < nCanzoni; i++) {
            if (PList[i].equals(canzone)) {

                // Rimozione proprio dall'array
                for (int j = i; j < nCanzoni - 1; j++) {
                    PList[j] = PList[j + 1];
                }
                PList[nCanzoni - 1] = null;
                nCanzoni--;
                break;
            }
        }
    }

    // Dice il cantante dal titolo inserito
    public String ricercaCantante(String nomeCanzone) {
        for (int i = 0; i < nCanzoni; i++) {
            if (PList[i].getNome().equalsIgnoreCase(nomeCanzone)) {
                return PList[i].getCantante();
            }
        }
        return "Non esiste";
    }

    // Trova tutte quelle di un cantante
    public Canzone[] ricercaCanzoni(String cantante) {
        Canzone[] CanzTrov = new Canzone[nCanzoni];
        int count = 0;
        for (int i = 0; i < nCanzoni; i++) {
            if (PList[i].getCantante().equalsIgnoreCase(cantante)) {
                CanzTrov[count] = PList[i];
                count++;
            }
        }
        Canzone[] risultato = new Canzone[count];
        for (int i = 0; i < count; i++) {
            risultato[i] = CanzTrov[i];
        }
        return risultato;
    }

    // Metodo toString che restituisce la playlist sotto forma di stringa


    // ** Cercato come si fa su internet **
    public String toString() {

        StringBuilder coso = new StringBuilder("[");

        for (int i = 0; i < nCanzoni; i++) {
            coso.append(PList[i]);
            if (i < nCanzoni - 1) {
                coso.append(", ");
            }
        }
        coso.append("]");
        return coso.toString();
    }
}




