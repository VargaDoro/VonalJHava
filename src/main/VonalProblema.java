package main;

import model.Vonal;

public class VonalProblema {

    public static void main(String[] args) {
        try {
            Vonal szaggatott = new Vonal(Vonal.PIROS_SZIN, Vonal.SZAGGATOTT, 5, 2);
            System.out.println(szaggatott.allapot());
            System.out.println("A vonal: " + szaggatott.Rajz());
        } catch (IllegalArgumentException ex){
            System.err.println("A program futása leállt!");
            System.err.println("Hiba --> " + ex.getMessage());
        }
    }
    
}
