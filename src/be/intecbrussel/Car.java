package be.intecbrussel;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Car {

    protected int maxSnelheid, huidigeSnelheid, paadenkrachtis, max_rijden, motor;

    protected String kleur, user_kleur;

    protected List<Integer> random;

    protected static int carCount;

    String name;

    String state;

    {
        maxSnelheid = 120;
        paadenkrachtis = 150;
        max_rijden = 100;
        motor = 100;
        kleur = "wit";
        random = new Random().ints(1, 100, 200).boxed().toList();
        state = "is onbekend";
    }

    @Override
    public String toString(){

        return "max snelheid: "+ this.maxSnelheid+"\n"+"paardenkrachtis: "+this.paadenkrachtis+"\n"+"max rijden: "+this.max_rijden+"\n"+"motor: "+this.motor+"\n"+"kleur: "+this.kleur+ "\n"+ "lichten: "+this.state;

            }

    Car() {
        carCount++;
    }

    Car(String kleur) {
        this();
        this.kleur = kleur;

    }

    Car(int max_rijden, String kleur) {
        this();
        this.max_rijden = max_rijden;
        this.kleur = kleur;
    }

    Car(int motor, int maxSnelheid, String kleur) {
        this();
        this.motor = motor;
        this.maxSnelheid = maxSnelheid;
        this.kleur = kleur;
    }

    Car (String name, String state){
        this();
        this.name = name;
        this.state = state;
    }

    int snelHeidplus() {

        for (huidigeSnelheid = 0; huidigeSnelheid < maxSnelheid + 5; huidigeSnelheid += 5) {
            System.out.println(huidigeSnelheid);
        }

        return 0;
    }

    int snelHeidmin() {

        for (huidigeSnelheid = maxSnelheid; huidigeSnelheid > 0; huidigeSnelheid -= 5) {
            System.out.println(huidigeSnelheid);
        }
        return 0;
    }

    String user_kleur_in() {

        Scanner in = new Scanner(System.in);
        user_kleur = in.nextLine();

        this.kleur = user_kleur;

        return user_kleur;

    }

    List<Integer> randomNum() {
        System.out.println("repair cost is: " + random);

        return random;
    }

    public static int getCarCount() {

        return carCount;
    }

    String toggleLights (){
        if (Objects.equals(this.state, "de lichten uit staan")){
            state = "de lichten aan staan";
            System.out.println(state);

        }else if (Objects.equals(this.state, "de lichten aan staan")){
            state="de lichten uit staan";
            System.out.println(state);
        }else {
            state="fout";
        }

        return state;
    }

    }






