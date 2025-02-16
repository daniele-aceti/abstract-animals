import Interfacce.Interfaccia;

public abstract class Animale implements Interfaccia{

    
    public abstract String faiVerso();

    public abstract String mangia();

    public abstract String nomeAnimale();


    @Override
    public String vola(){
        String vola = "Vola";
        return vola;
    }

    @Override
    public String nuota(){
        String nuota = "Nuota";
        return nuota;
    }


    public String dormi(){
        String versoDormi = "Zzz";
        return versoDormi;
    }



    public void stampa(){
        String nuotoVolo = null;
        if( nomeAnimale().equals("Delfino")){
            nuotoVolo = vola();
        }else if(nomeAnimale().equals("Passerotto")|| nomeAnimale().equals("Aquila")){
            nuotoVolo = nuota();
        }else{
            nuotoVolo = "Non nuoto e non volo";
        }
        System.out.println("Il verso " + nomeAnimale() + " è " + faiVerso() + " " + nuotoVolo + " mangia principalmente " + mangia() + " e quando dorme fa " + dormi());
    }
}