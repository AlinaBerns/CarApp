package be.intecbrussel;
import java.util.Arrays;
import java.util.List;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("paars");
        Car car2 = new Car(70, "groen");
        Car car3 = new Car(200, 160,"geel");



        System.out.println("***CAR 1***"+"\n"+"max snelheid: "+car1.maxSnelheid+ "\n" + "paardenkrachtis: "+ car1.paadenkrachtis +"\n"+ "max rijden: "+car1.max_rijden+"\n"+"motor: "+car1.motor+"\n"+"kleur: "+car1.kleur+"\n\n");
        System.out.println("***CAR 2***"+"\n"+"max snelheid: "+car1.maxSnelheid+ "\n" + "paardenkrachtis: "+ car1.paadenkrachtis +"\n"+ "max rijden: "+car2.max_rijden+"\n"+"motor: "+car1.motor+"\n"+"kleur: "+car2.kleur+"\n\n");
        System.out.println("***CAR 3***"+"\n"+"max snelheid: "+car3.maxSnelheid+ "\n" + "paardenkrachtis: "+ car1.paadenkrachtis +"\n"+ "max rijden: "+car1.max_rijden+"\n"+"motor: "+car3.motor+"\n"+"kleur: "+car3.kleur+"\n\n");

        System.out.println("De huidige snelheid CAR 1: ");
        int car1_pl = car1.snelHeidplus();

        System.out.println("De huidige snelheid CAR 3: ");
        int car3_min = car3.snelHeidmin();

        String userKleur = car1.user_kleur_in();
        System.out.println("Nieuwe kleur van CAR 1: " + userKleur);

        List<Integer> rapairCost = car2.randomNum();
        



    }
}
