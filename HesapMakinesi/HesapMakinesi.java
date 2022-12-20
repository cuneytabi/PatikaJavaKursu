package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2, islem;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.println("ikinci sayıyı giriniz :");
        sayi2 = input.nextInt();

        System.out.println("Toplama için 1'e\nÇıkarma için 2'ye\nÇarpma için 3'e\nBölme için 4'e basınız. ");
        islem = input.nextInt();

        switch (islem){

            case 1 :
                System.out.println("Sayıların toplamı : "+ (sayi1+sayi2));break;

            case 2 :
                System.out.println("Sayıların farkı : "+ (sayi1-sayi2));break;

            case 3 :
                System.out.println("Sayıların çarpımı : "+ (sayi1*sayi2));break;

            case 4 :
                System.out.println("Sayıların bölümü : "+ (sayi1/sayi2));break;

                default:
                    System.out.println("işlem tipi seçilmedi");
        }

    }

}
