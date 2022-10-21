package mostenire.simpla;

public class Avion extends Vehicul{
    private int capacitatePersoane;
    private int cost;
    private String companie;
    public Avion( String companie, int cost, int capacitatePersoane){
        super("aerian",70,21);
        this.companie=companie;
        this.cost=cost;
        this.capacitatePersoane=capacitatePersoane;
        }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCapacitatePersoane(int capacitatePersoane) {
        this.capacitatePersoane = capacitatePersoane;
    }

    public int getCapacitatePersoane() {
        return capacitatePersoane;
    }
    @Override
    public String toString(){
        return super.toString()+
                " Companie "+this.companie+" Costul "+this.cost+"$  Capacitatea Persoane "+ this.capacitatePersoane;
    }
}
