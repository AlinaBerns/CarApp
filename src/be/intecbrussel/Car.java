package be.intecbrussel;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Car {

    protected int maxSnelheid, huidigeSnelheid, paadenkrachtis, max_rijden, motor;

    protected String kleur, user_kleur;

    protected List<Integer> random;

    {
        maxSnelheid = 120;
        paadenkrachtis = 150;
        max_rijden = 100;
        motor = 100;
        kleur = "wit";
        random = new Random().ints(1, 100, 200).boxed().toList();
    }

    Car() {
    }

    Car(String kleur) {
        this.kleur = kleur;

    }

    Car(int max_rijden, String kleur) {
        this.max_rijden = max_rijden;
        this.kleur = kleur;
    }

    Car(int motor, int maxSnelheid, String kleur) {
        this.motor = motor;
        this.maxSnelheid = maxSnelheid;
        this.kleur = kleur;
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

        System.out.println("Voel jouw kleur: ");
        Scanner in = new Scanner(System.in);
        user_kleur = in.nextLine();

        this.kleur = user_kleur;

        return user_kleur;

    }

    List<Integer> randomNum() {
        System.out.println("repair cost is: " + random);

        return random;
    }

}




