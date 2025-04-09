package model;

public class Vonal {
    public static final String SZAGGATOTT = "szaggatott";
    public static final String PONTOZOTT = "pontozott";
    public static final String NORMAL = "normal";
    public static final String DUPLA = "dupla";
    
    public static final String PIROS_SZIN = "piros";
    public static final String ZOLD_SZIN = "zöld";
    public static final String SARGA_SZIN = "sárga";
    
    private String szin;
    private String forma;
    private int hossz;
    private int eltolas;
    
    public Vonal(String szin, String forma, int hossz, int eltolas){
        this.szin = szin;
        this.forma = forma;
        this.hossz = hossz;
        this.eltolas = eltolas;
    }
    
    public String allapot(){
        return "A vonal adatai: szin: "+szin+", forma: '"+formaAlakzat()+"', hossz: "+hossz+", eltolás: "+eltolas;
    }
    
    
    public String Rajz(){
        String megtettUt = "";
        for (int i = 0; i < hossz; i++) {
            megtettUt += formaSzin();
        }
        return megtettUt;
    }
    
    public String formaAlakzat(){
        String szaggatott = "-";
        String pontozott = ".";
        String normal = "_";
        String dupla = "=";
        
        String kod = "";
        switch(forma){
            /* case "piros": */
            case Vonal.SZAGGATOTT:
                kod = szaggatott;
                break;
            //case "zöld":
            case Vonal.PONTOZOTT:
                kod = pontozott;
                break;
            case Vonal.DUPLA:
                kod = dupla;
                break;
            default:
                kod = normal;
        }
        
        return kod;
    }
    
    public String formaSzin(){
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        
        String kod = "";
        switch(szin){
            /* case "piros": */
            case Vonal.PIROS_SZIN:
                kod = RED;
                break;
            //case "zöld":
            case Vonal.ZOLD_SZIN:
                kod = GREEN;
                break;
            case Vonal.SARGA_SZIN:
                kod = YELLOW;
                break;
            default:
                kod = RESET;
        }
        
        return kod + formaAlakzat() + RESET;
    }
    
    public String getSzin(){
        return szin;
    }
    
    public String getForma(){
        return forma;
    }
    
    public int getHossz(){
        return hossz;
    }
    
    public void setEltolas(int eltolas){
        this.eltolas = eltolas;
    }
    
    public int getEltolas(){
        return eltolas;
    }
}
