package mostenire.simpla;

public class Vehicul {
    private String tipul;
    private float greutate;
    private float inaltime;

    public Vehicul(String tipul, float greutate, float inaltime){
        this.tipul=tipul;
        this.greutate=greutate;
        this.inaltime=inaltime;
    }
    
    public Vehicul(float greutate, float inaltime){
        this.greutate=greutate;
        this.inaltime=inaltime;
    }

    public String getTipul() {
        return tipul;
    }

    public void setTipul(String tipul) {
        this.tipul = tipul;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    public float getInaltime() {
        return inaltime;
    }
    
    public String toString(){
        return "Tipul: "+tipul + " Greutate: "+greutate+" Inaltime:  "+inaltime;
    }
}
