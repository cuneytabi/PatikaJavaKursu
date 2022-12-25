package HavaSicakliginaGoreEtkinlik;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hava kaç derece ? ");

        int hararet = input.nextInt();

        if(hararet<=5){
            System.out.println("kayak yapabilirsin");
        }else if (5<hararet&&hararet<=15){
            System.out.println("sinemaya gidebilirsin");
        }else if (15<hararet&&hararet<=25){
            System.out.println("Pikniğe gidebilirsin");
        }else if (hararet>25){
            System.out.println("yüzmeye gidebilirsin");
        }
    }
}
