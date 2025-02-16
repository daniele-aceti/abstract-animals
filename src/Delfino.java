
public class Delfino extends Animale implements Interfaccia {

    @Override
    public String nomeAnimale() {
        String nomeDelfino = "Del Delfino";
        return nomeDelfino;
    }

    @Override
    public String faiVerso() {
        String versoDelfino = "Suono";
        return versoDelfino;
    }

    @Override
    public String mangia() {
        String mangiaDelfino = "Pesce";
        return mangiaDelfino;
    }

    public void nuota(){
        System.out.println("Sto nuotando");
    }

    public void vola(){
        System.out.println("Non volo");
    }
}
