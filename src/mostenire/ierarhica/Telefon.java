package mostenire.ierarhica;

public class Telefon {
    private Integer cost;
    private String culoare;
    private boolean portabil;

    public Telefon( Integer cost, String culoare, boolean portabil){
        this.cost=cost;
        this.culoare=culoare;
        this.portabil =portabil;
    }

    public Telefon( String culoare, Integer nrCamere){
        this.culoare=culoare;
        this.portabil =portabil;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public void isPortabil(boolean portabil) {
        this.portabil = portabil;
    }

    public boolean getPortabil() {
        return portabil;
    }

    public String toString(){
        return "Costul: "+cost + " Culoare: "+culoare+" Portabil:  "+ portabil;
    }
}
