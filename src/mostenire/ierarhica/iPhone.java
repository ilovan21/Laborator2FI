package mostenire.ierarhica;

public class iPhone extends Telefon{
    private String sistemOperare;
    private Integer memorie;
    private Integer nrCamere=4;

    public iPhone(int memorie,String sistemOperare, Integer nrCamere){
        super(429,"alb",true);
        this.memorie=memorie;
        this.sistemOperare=sistemOperare;
        this.nrCamere=nrCamere;
    }

    public void setMemorie(Integer memorie){
        this.memorie=memorie;
    }
    public int getMemorie() {
        return memorie;
    }
    public void setNrCamere(Integer nrCamere){
        this.nrCamere=nrCamere;
    }
    public Integer getNrCamere() {
        return nrCamere;
    }
    public void setSistemOperare(String sistemOperare){
        this.sistemOperare=sistemOperare;
    }
    public String getSistemOperare() {
        return sistemOperare;
    }
    @Override
    public String toString(){
        return super.toString()+
                " Memorie RAM "+this.memorie+" NrCamere "+this.nrCamere+" Sistem de Operare "+ this.sistemOperare;
    }
}
