
public class Passerotto extends Animale implements Interfaccia {

    @Override
    public String nomeAnimale() {
        String nomePasserotto = "Del Passerotto";
        return nomePasserotto;
    }

    @Override
    public String faiVerso() {
        String versoPasserotto = "Cinguettio";
        return versoPasserotto;
    }

    @Override
    public String mangia() {
        String mangiaPasserotto = "Erba";
        return mangiaPasserotto;
    }

    public void vola() {
        System.out.println("Sto volando");
    }

    public void nuota(){
        System.out.println("Non nuoto");
    }
}
