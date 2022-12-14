package TaksimetreProgram;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        double priceKm= 2.20;
        double startPrice=10;
        double minPrice=20;

        Scanner input= new Scanner(System.in);
        System.out.println("mesafeyi KM cinsinden giriniz");
        double yolKm=input.nextDouble();

        double totalPrice=(yolKm*priceKm)+startPrice;

        double ucret=(totalPrice>=20)?totalPrice:minPrice;

        System.out.println(yolKm+" KM yol için ödenecek taksi ücreti :"+ucret+" TL'dir");

    }
}
