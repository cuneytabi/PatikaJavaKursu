package BurcBulanProgram;

import java.util.Scanner;

public class BurcBulanProgram {

    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("doğduğunuz gün: ");
        day = input.nextInt();

        if((month==1) && (day>=1&&day<=31)){
            if(day<22){
                System.out.println("oğlak burcu");
            }else {
                System.out.println("kova burcu");
            }
        }else if((month==2) && (day>=1&&day<=28)){
            if(day<20){
                System.out.println("kova burcu");
            }else {
                System.out.println("balık burcu");
            }
        }else if((month==3) && (day>=1&&day<=31)){
            if(day<20){
                System.out.println("balık burcu");
            }else {
                System.out.println("koç burcu");
            }
        }else if((month==4) && (day>=1&&day<=30)){
            if(day<20){
                System.out.println("koç burcu");
            }else {
                System.out.println("boğa burcu");
            }
        }else if((month==5) && (day>=1&&day<=31)){
            if(day<21){
                System.out.println("boğa burcu");
            }else {
                System.out.println("ikizler burcu");
            }
        }else if((month==6) && (day>=1&&day<=30)){
            if(day<23){
                System.out.println("ikizler burcu");
            }else {
                System.out.println("yengeç burcu");
            }
        }else if((month==7) && (day>=1&&day<=31)){
            if(day<23){
                System.out.println("yengeç burcu");
            }else {
                System.out.println("aslan burcu");
            }
        }else if((month==8) && (day>=1&&day<=31)){
            if(day<23){
                System.out.println("aslan burcu");
            }else {
                System.out.println("başak burcu");
            }
        }else if((month==9) && (day>=1&&day<=30)){
            if(day<23){
                System.out.println("başak burcu");
            }else {
                System.out.println("terazi burcu");
            }
        }else if((month==10) && (day>=1&&day<=31)){
            if(day<23){
                System.out.println("terazi burcu");
            }else {
                System.out.println("akrep burcu");
            }
        }else if((month==11) && (day>=1&&day<=30)){
            if(day<22){
                System.out.println("akrep burcu");
            }else {
                System.out.println("yay burcu");
            }
        }else if((month==12) && (day>=1&&day<=31)){
            if(day<22){
                System.out.println("yay burcu");
            }else {
                System.out.println("oğlak burcu");
            }
        }else {
            System.out.println("geçersiz bir gün girdiniz");
        }

    }


}
