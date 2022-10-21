package mostenire.ierarhica;

public class Android extends Telefon{
    private String model;
    private String sistemOperare;
    private Integer memorie;
    public Android( String model, int memorie,String sistemOperare){
        super(1050,"negru",true);
        this.model=model;
        this.memorie=memorie;
        this.sistemOperare=sistemOperare;
    }

    public void setMemorie(Integer memorie){
        this.memorie=memorie;
    }
    public int getMemorie() {
        return memorie;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel() {
        return model;
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
                " Memorie RAM "+this.memorie+" Model "+this.model+" Sistem de Operare "+ this.sistemOperare;
    }

}
