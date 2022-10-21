package mostenire.simpla;

public class Main2 {
    public static void main(String[] args) {
        Vehicul vapor=new Vehicul("acvatic",1999,20);
        System.out.println(vapor);
        vapor.setGreutate(190);
        System.out.println(vapor.getGreutate());
        Avion avion=new Avion("Wizzair",90,35);
        System.out.println(avion);
        avion.setCost(120);
        avion.setCompanie("eDreams");
        System.out.println(avion.getCost());

    }
}
