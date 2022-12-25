package SinifGecmeDurumuPratik;

import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {

        int toplamNot = 0;
        int ortalama;

        System.out.println("Matematik notunu giriniz : ");
        Scanner input = new Scanner(System.in);
        int mat = input.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        input = new Scanner(System.in);
        int fizik = input.nextInt();

        System.out.println("Türkçe notunu giriniz : ");
        input = new Scanner(System.in);
        int turkce = input.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        input = new Scanner(System.in);
        int kimya = input.nextInt();

        System.out.println("Muzik notunu giriniz : ");
        input = new Scanner(System.in);
        int muzik = input.nextInt();

        if (0<=mat && mat <=100)
            toplamNot = toplamNot + mat;
        if (0<=fizik && fizik <=100)
            toplamNot = toplamNot + fizik;
        if (0<=turkce && turkce <=100)
            toplamNot = toplamNot + turkce;
        if (0<=kimya && kimya <=100)
            toplamNot = toplamNot + kimya;
        if (0<=muzik && muzik <=100)
            toplamNot = toplamNot + muzik;

        ortalama = toplamNot/5;
        if(ortalama>=55){
            System.out.println("Ortalama : "+ortalama+", Sınıf geçti");
        }else {
            System.out.println("Ortalama : "+ortalama+", Sınıf kaldı");
        }
        boolean sonuc = ortalama>=50;

        String durum = sonuc?"gectin":"kaldın";

        System.out.println("Ortalama : "+ortalama+" sınıf "+durum);

    }
}
