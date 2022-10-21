package incapsulare;

public class Flori {

    private String familia;
    private int nrPetale;
    private String culoare;

    public void setFamilia(String familia){
        this.familia = familia;
    }
    
    public String getFamilia(){
        return this.familia;
    }
    
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
    
    public String getCuloare(){
        return this.culoare;
    }
    
    public void setNrPetale(int nrPetale){
        this.nrPetale=nrPetale;
    }
    
    public int getNrPetale(){
        return this.nrPetale;
    }
    
    Flori(String clasa, int nrPetale, String culoare){
        this.familia =clasa;
        this.nrPetale=nrPetale;
        this.culoare=culoare;
    }
    
    public String toString(){
        return " Familia: "+familia +" Nr de petale: "+nrPetale+" Culoarea: "+culoare;
    }
}
