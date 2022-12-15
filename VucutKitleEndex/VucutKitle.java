package VucutKitleEndex;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        Scanner input=new Scanner(System.in);
        double boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        input=new Scanner(System.in);
        double kilo = input.nextInt();

        Double index= kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+index);
    }
}
