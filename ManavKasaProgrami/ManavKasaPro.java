package ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaPro {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        double toplam;

        System.out.print("Armut Kaç Kilo ? :");
        Scanner input= new Scanner(System.in);
        double kilo = input.nextDouble();

        armut=armut*kilo;

        System.out.print("Elma Kaç Kilo ? :");
        input= new Scanner(System.in);
        kilo = input.nextDouble();

        elma=elma*kilo;

        System.out.print("Domates Kaç Kilo ? :");
        input= new Scanner(System.in);
        kilo = input.nextDouble();

        domates=domates*kilo;

        System.out.print("Muz Kaç Kilo ? :");
        input= new Scanner(System.in);
        kilo = input.nextDouble();

        muz=muz*kilo;

        System.out.print("Patlıcan Kaç Kilo ? :");
        input= new Scanner(System.in);
        kilo = input.nextDouble();

        patlican=patlican*kilo;

        toplam=armut+elma+domates+muz+patlican;

        System.out.println("Toplam tutar :"+toplam);




    }
}
