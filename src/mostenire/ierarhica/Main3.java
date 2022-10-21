package mostenire.ierarhica;

public class Main3 {
    public static void main(String[] args) {
        Telefon T=new Telefon(120,"rosu",false);
        System.out.println(T);
        Android GalaxyS10Plus=new Android("Samsung Galaxy S10 Plus",128,"Andoid");
        System.out.println(GalaxyS10Plus);
        GalaxyS10Plus.setMemorie(256);
        System.out.println(GalaxyS10Plus.getMemorie());
        iPhone SE3=new iPhone(64,"iOS",1);
        System.out.println(SE3);
        SE3.setCuloare("rosu");
        System.out.println(SE3.getCuloare());
    }
}