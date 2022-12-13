package UcgeninAlani;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UcgeninAlani {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Alan hesabı için Üçgenin 1. kenarını ekrana giriniz");

        int a=input.nextInt();

        System.out.println("2. kenarını ekrana giriniz");

        int b=input.nextInt();

        System.out.println("3. kenarını ekrana giriniz");

        int c=input.nextInt();

        double u=(a+b+c)/2;

        double alan;

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı = "+alan);

    }
}
