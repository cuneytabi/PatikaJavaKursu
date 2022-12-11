package Giris;
import java.util.Scanner;

public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        // Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik sinav puanlarini kullanıcıdan alalım

        Scanner sinavPuani=new Scanner(System.in);
        System.out.println("matematik puanını giriniz");
        int matematik = sinavPuani.nextInt();

        System.out.println("fizik puanını giriniz");
        int fizik = sinavPuani.nextInt();

        System.out.println("kimya puanını giriniz");
        int kimya=sinavPuani.nextInt();

        System.out.println("türkçe puanını giriniz");
        int turkce = sinavPuani.nextInt();

        System.out.println("tarih puanını giriniz");
        int tarih = sinavPuani.nextInt();

        System.out.println("müzik puanını giriniz");
        int muzik = sinavPuani.nextInt();

        float ortalama= ((matematik+fizik+kimya+turkce+tarih+muzik)/6);

        System.out.println("not ortalaması: "+ortalama);

        boolean kosul= ortalama>60;

        String sonuc= kosul? "Sınıfı Geçti":"Sınıfta Kaldı";

        System.out.println(sonuc);

    }
}
