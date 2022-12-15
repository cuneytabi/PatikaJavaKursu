package DaireninAlani;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        int r,alfa;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);
        System.out.println("yarıçapı giriniz");
        r=inp.nextInt();

        System.out.println("merkez açının ölçüsünü giriniz");
        alfa=inp.nextInt();

        double alan = pi*r*r;
        System.out.println(alan);
        double alfaAlan = (alfa*alan)/360;

        System.out.println("merkez açısı "+alfa+" olan üçgenin alanı ="+alfaAlan+" dır.");


    }
}
