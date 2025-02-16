
public class VoloNuoto {



    public void faiVolare(String animale) {
        if (animale.equals("Passerotto") || animale.equals("Aquila")) {
            Aquila aquila = new Aquila();
            aquila.vola();
        } else {
            System.out.println("Non volo");
        }
    }

    public void faiNuotare(String animale) {
        if (animale.equals("Delfino")) {
            Delfino delfino = new Delfino();
            delfino.nuota();
        } else {
            System.out.println("Non nuoto");
        }
    }
}
