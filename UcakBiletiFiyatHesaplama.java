import java.util.Scanner;

class UcakBiletiFiyatHesaplama {
	
	public static void main(String[] args){
	
		int mesafe;
		int age;
		int yolculukTipi;
		double mesafeKmUcret=0.10;
		double biletFiyati;
		double ucusBedeli;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km turunden giriniz: ");
		mesafe = input.nextInt();
		
		if(mesafe>=0){
			mesafe=mesafe;
		}else{
			System.out.println("hatali veri girdiniz, lutfen mesafeyi yeniden giriniz.");
		mesafe = input.nextInt();
		}
		
		System.out.print("Yasinizi giriniz : ");
		age = input.nextInt();
		
		if(age>=0){
			age=age;
		}else{
			System.out.println("hatali veri girdiniz lutfen yolcu yasini yeniden giriniz.");
		age = input.nextInt();
		}
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus )");
		yolculukTipi = input.nextInt();
		
		if(yolculukTipi==1 || yolculukTipi==2){
			yolculukTipi=yolculukTipi;	
		}else{
			System.out.println("hatali veri girdiniz, lutfen Tek yon icin '1', gidis donus icin '2' giriniz:");
		yolculukTipi = input.nextInt();
		}
		
		System.out.println("Mesafe: "+mesafe+", yasiniz: "+age+", yolculugunuz: "+yolculukTipi);
		
		biletFiyati = mesafe*mesafeKmUcret;
		System.out.println(	"bilet fiyati: "+biletFiyati);
		
		if(age<12){
			ucusBedeli=(biletFiyati-(biletFiyati*0.5));
			System.out.println("yas indirimi: "+(biletFiyati*0.5));
		}else if(12<=age&&age<=24){
			ucusBedeli=(biletFiyati-(biletFiyati*0.1));
			System.out.println("yas indirimi: "+(biletFiyati*0.1));
		}else if(age>65){
			ucusBedeli=(biletFiyati-(biletFiyati*0.3));
			System.out.println("yas indirimi: "+(biletFiyati*0.3));
		}else {
			ucusBedeli = biletFiyati;
		}
		if(yolculukTipi==2){
			System.out.println("Gidis-Donus indirimi: "+(ucusBedeli*0.4));
			ucusBedeli=((2*ucusBedeli)-(ucusBedeli*0.4));
			
		}else{
			ucusBedeli = ucusBedeli;
		}
		System.out.println("Toplam ucus bedeli: "+ucusBedeli+" TL'dir");
	}
}