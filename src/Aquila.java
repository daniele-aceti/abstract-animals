
public class Aquila extends Animale implements Interfaccia {

    @Override
    public String nomeAnimale() {
        String nomeAquila = "Dell'Aquila";
        return nomeAquila;
    }

    @Override
    public String faiVerso() {
        String versoAquila = "Strido";
        return versoAquila;
    }

    @Override
    public String mangia() {
        String mangiaAquila = "Carne";
        return mangiaAquila;
    }

    public void vola() {
        System.out.println("Sto volando");
    }
    public void nuota() {
        System.out.println("Non nuoto");
    }
}
