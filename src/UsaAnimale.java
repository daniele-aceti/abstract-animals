
public class UsaAnimale {

    public static void main(String[] args) {
        Animale aquilaReale = new Aquila();
        aquilaReale.stampa();
        
        Animale caneFuffi = new Cane();
        caneFuffi.stampa();

        Animale delfinoUlisse = new Delfino();
        delfinoUlisse.stampa();

        Animale passerottoOtto = new Passerotto();
        passerottoOtto.stampa();

        VoloNuoto animali = new VoloNuoto();
        animali.faiVolare("Aquila");
        animali.faiVolare("Passerotto");
        animali.faiNuotare("Delfino");




    }
}
