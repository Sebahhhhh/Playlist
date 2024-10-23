package Spotify;

public class Canzone {
    private String nome;
    private String cantante;
    private int durata;

    // Vuoti
    public Canzone() {
        this.nome = " ";
        this.cantante = " ";
        this.durata = 0;
    }

    public Canzone(String nome, String cantante, int durata) {
        this.nome = nome;
        this.cantante = cantante;
        this.durata = durata;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    // ToString per unire tutto
    public String toString() {
        return "Canzone [Nome=" + nome + ", Cantante=" + cantante + ", Durata=" + durata + "s]";
    }
}


