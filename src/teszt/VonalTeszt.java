package teszt;

import model.Vonal;

public class VonalTeszt {
    public static void main(String[] args) {
        new VonalTeszt();
    }
    
    public VonalTeszt(){
        tesztKonstruktorJoAdatokkal();
        tesztSetSzinJoAdatokkal();
    }

    private void tesztKonstruktorJoAdatokkal() {
        String vartSzin = Vonal.PIROS_SZIN;
        String vartForma = Vonal.PONTOZOTT;
        System.out.printf("----Konstruktor(%s, %s)\n", vartSzin, vartForma);
        Vonal vonalt = new Vonal(vartSzin, vartForma, -5, 5);
        
        String kapottSzin = vonalt.getSzin();
        String kapottHaz = vonalt.getForma();
        
        assert kapottSzin.equals(vartSzin) : "Nem jó színt adott meg";
        assert kapottHaz.equals(vartForma) : "Nem jó formát adott meg";
        System.out.println("Rendben!");
    }

    private void tesztSetSzinJoAdatokkal() {
        
    }

}
