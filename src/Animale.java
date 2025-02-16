
public abstract class Animale {

    public abstract String faiVerso();

    public abstract String mangia();

    public abstract String nomeAnimale();

    public String dormi() {
        String versoDormi = "Zzz";
        return versoDormi;
    }

    public void stampa() {
        System.out.println("Il verso " + nomeAnimale() + " è " + faiVerso() + " mangia principalmente " + mangia() + " e quando dorme fa " + dormi());
    }
}
