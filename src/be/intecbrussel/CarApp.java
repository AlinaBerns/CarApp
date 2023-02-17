package be.intecbrussel;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("OPDRACHT_1_en_2\n");
        Car car1 = new Car("paars");
        Car car2 = new Car(70, "groen");
        Car car3 = new Car(200, 160, "geel");
        Car car4 = new Car ("Car_4: ", "de lichten uit staan");
        Car car5 = new Car ("Car_5","de lichten aan staan");


        System.out.println("***CAR 1***" + "\n" + "max snelheid: " + car1.maxSnelheid + "\n" + "paardenkrachtis: " + car1.paadenkrachtis + "\n" + "max rijden: " + car1.max_rijden + "\n" + "motor: " + car1.motor + "\n" + "kleur: " + car1.kleur +"\n"+ car1.state+"\n\n");
        System.out.println("***CAR 2***" + "\n" + "max snelheid: " + car1.maxSnelheid + "\n" + "paardenkrachtis: " + car1.paadenkrachtis + "\n" + "max rijden: " + car2.max_rijden + "\n" + "motor: " + car1.motor + "\n" + "kleur: " + car2.kleur + "\n"+car2.state+"\n\n");
        System.out.println("***CAR 3***" + "\n" + "max snelheid: " + car3.maxSnelheid + "\n" + "paardenkrachtis: " + car1.paadenkrachtis + "\n" + "max rijden: " + car1.max_rijden + "\n" + "motor: " + car3.motor + "\n" + "kleur: " + car3.kleur + "\n"+car3.state+"\n\n");
        System.out.println("***CAR 4***" + "\n" + "max snelheid: " + car3.maxSnelheid + "\n" + "paardenkrachtis: " + car1.paadenkrachtis + "\n" + "max rijden: " + car1.max_rijden + "\n" + "motor: " + car3.motor + "\n" + "kleur: " + car3.kleur + "\n"+car4.state+"\n\n");
        System.out.println("***CAR 5***" + "\n" + "max snelheid: " + car3.maxSnelheid + "\n" + "paardenkrachtis: " + car1.paadenkrachtis + "\n" + "max rijden: " + car1.max_rijden + "\n" + "motor: " + car3.motor + "\n" + "kleur: " + car3.kleur + "\n"+car5.state+"\n\n");

        System.out.println("OPDRACHT_3\n");

        System.out.println("De huidige snelheid CAR 1: ");
        int car1_pl = car1.snelHeidplus();

        System.out.println("De huidige snelheid CAR 3: ");
        int car3_min = car3.snelHeidmin();

        Scanner myScanner0 = new Scanner(System.in);

            System.out.println("Voer het nummer in van de auto waarvan u de kleur wilt wijzigen: ");
            int carkleur = myScanner0.nextInt();

            switch (carkleur) {
                case 1:
                    System.out.println("voer een kleur in: ");
                    String userKleur = car1.user_kleur_in();
                    System.out.println("Nieuwe kleur van CAR 1: " + userKleur);
                    break;

                case 2:
                    System.out.println("voer een kleur in: ");
                    String userKleur2 = car2.user_kleur_in();
                    System.out.println("Nieuwe kleur van CAR 2: " + userKleur2);
                    break;

                case 3:
                    System.out.println("voer een kleur in: ");
                    String userKleur3 = car3.user_kleur_in();
                    System.out.println("Nieuwe kleur van CAR 3: " + userKleur3);
                    break;

                case 4:
                    System.out.println("voer een kleur in: ");
                    String userKleur4 = car4.user_kleur_in();
                    System.out.println("Nieuwe kleur van CAR 4: " + userKleur4);
                    break;

                case 5:
                    System.out.println("voer een kleur in: ");
                    String userKleur5 = car5.user_kleur_in();
                    System.out.println("Nieuwe kleur van CAR 5: " + userKleur5);
                    break;

                default:
                    System.out.println("Geen auto");
            }

            List<Integer> rapairCost = car2.randomNum();

        System.out.println("OPDRACHT_6\n");

            System.out.println("Het aantal wagens: " + Car.getCarCount());

        System.out.println("OPDRACHT_4\n");

            Scanner myScanner = new Scanner(System.in);


            System.out.println("Voer het nummer van de auto in om de informatie te krijgen: ");
            int carNum = myScanner.nextInt();

            if (carNum == 1) {
                System.out.println("***CAR 1***\n" + car1);

            } else if (carNum == 2) {
                System.out.println("***CAR 2***\n" + car2);

            } else if (carNum == 3) {
                System.out.println("***CAR 3***\n" + car3);

            } else if (carNum == 4) {
                System.out.println("***CAR 4***\n" + car4);

            }else if (carNum ==5) {
                System.out.println("***CAR 5***\n" + car5);
            }
            else {
                System.out.println("geen auto");
            }

        System.out.println("OPDRACHT_7\n");

            String lichten3 = car3.toggleLights();
            String lichten4 = car4.toggleLights();
            String lichten5 = car5.toggleLights();


        }
    }


