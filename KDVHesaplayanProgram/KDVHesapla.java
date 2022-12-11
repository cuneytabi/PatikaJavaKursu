package KDVHesaplayanProgram;

import java.util.Scanner;

public class KDVHesapla {
    public static void main(String[] args) {

        double tutar,kdvOran;

        Scanner input = new Scanner(System.in);
        System.out.println("KDV hesabı için ekrana tutar giriniz");
        tutar=input.nextDouble();

        boolean kosul = tutar<=1000;

        kdvOran=kosul?0.18:0.08;

        System.out.println(tutar+" TL için alınacak KDV oranı = "+kdvOran);

        System.out.println("KDV'siz Fiyat = "+tutar+" TL");
        System.out.println("KDV'li Fiyat = "+(tutar+(tutar*kdvOran))+" TL");
        System.out.println("KDV tutarı = "+(tutar*kdvOran)+" TL");

    }
}
