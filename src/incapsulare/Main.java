package incapsulare;

public class Main {
    public static void main(String[] args) {
        Flori trandafir =new Flori("Rosaceae",20,"Alb");
        System.out.println(trandafir);
        trandafir.setCuloare("Rosu");
        System.out.println(trandafir.getCuloare());
        trandafir.setNrPetale(40);
        System.out.println(trandafir.getNrPetale());

        Copaci mar=new Copaci("Magnoliopsida",1.5,true,2);
        System.out.println(mar);
        mar.setMarime(2.0);
        mar.isRoditor(false);
        System.out.println(mar.getMarime());
        System.out.println(mar.getRoditor());
    }
}
