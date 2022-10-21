package incapsulare;

public class Copaci {
    private String clasa;
    private Double marime;
    boolean roditor;
    private int varsta;

    Copaci(String clasa, Double marime, boolean roditor, int varsta){
        this.clasa=clasa;
        this.marime=marime;
        this.roditor=roditor;
        this.varsta=varsta;
    }
    public void setClasa(String clasa){
        this.clasa=clasa;
    }
    public String getClasa(){
        return this.clasa;
    }
    public void setMarime(Double marime){
        this.marime=marime;
    }
    public Double getMarime(){
        return this.marime;
    }
    public void isRoditor(boolean roditor){
        this.roditor=roditor;
    }
    public boolean getRoditor(){
        return this.roditor;
    }

    public String toString(){
        return "Clasa: "+clasa +" Marime: "+marime+" Roditor: "+roditor+" Varsta: "+varsta;
    }
}
