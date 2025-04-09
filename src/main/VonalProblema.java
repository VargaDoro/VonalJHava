package main;

import model.Vonal;

public class VonalProblema {

    public static void main(String[] args) {
        try {
            Vonal szaggatott = new Vonal(Vonal.PIROS_SZIN, Vonal.SZAGGATOTT, 5, 5);
            System.out.println(szaggatott.allapot());
            System.out.println("A vonal: " + szaggatott.Rajz());
            
            Vonal dupla = new Vonal(Vonal.SARGA_SZIN, Vonal.DUPLA, 8, 3);
            System.out.println(dupla.allapot());
            System.out.println("A vonal: " + dupla.Rajz());
            System.out.println("Setter után:");
            dupla.setEltolas(-6);
            System.out.println(dupla.allapot());
        } catch (IllegalArgumentException ex){
            System.err.println("A program futása leállt!");
            System.err.println("Hiba --> " + ex.getMessage());
        }
    }
    
}
