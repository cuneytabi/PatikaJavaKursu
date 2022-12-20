package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisKontrol {

    public static void main(String[] args) {

        String userName = "kobra";
        String pass = "123";

        Scanner inp = new Scanner(System.in);

        System.out.println("şifrenizi giriniz :");
        String inputPass = inp.nextLine();

        if(pass.equals(inputPass)){
            System.out.println("giriş başarılı");
        }else {
            System.out.println("Hatalı şifre girdiniz\nŞifrenizi sıfırlamak istiyorsanız yeni şifre giriniz");


            String inputPass2 = inp.nextLine();

            if (pass.equals(inputPass2)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");

                inputPass2 = inp.nextLine();
                System.out.println("Yeni şifre Oluşturuldu");

            } else {
                
                System.out.println("Yeni Şifre Oluşturuldu");

            }

        }

    }

}
