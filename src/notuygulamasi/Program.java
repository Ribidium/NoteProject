package notuygulamasi;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Not eklemek için -> 1");
			System.out.println("Not güncellemek için -> 2");
			System.out.println("Çıkış -> 3");
			
			int secim = scn.nextInt(); scn.nextLine();  // \n
			
			if(secim == 3) {
				
				Database.raporVer();
				
				System.out.println("Çıkış Yapıldı...");
				break;
			}else if (secim == 1) {
				System.out.print("Notunuzu girin: ");
				String not = scn.nextLine();
				
				Not n = new Not(not);
				Database.NOTLAR.add(n);
				Database.GUNCELLEMELER.add(n);
				System.out.println("Not veritabanına eklendi!");
				
			}else if ( secim == 2) {
				Database.notlarTablosunuYazdir();
				System.out.print("Güncellemek istediğiniz notu seçin: ");
				int notIndex = scn.nextInt(); scn.nextLine();
				Not n = Database.NOTLAR.get(notIndex);
				System.out.print("Yeni notunuzu girin: ");
				String yeniNot = scn.nextLine();
				
				n.setNot(yeniNot);
				n.setSonGuncellenmeTarihi(LocalDateTime.now());
				n.getGuncellemeGecmisi().add(yeniNot);
				
				Database.GUNCELLEMELER.remove(n);
				Database.GUNCELLEMELER.add(n);
				
			}else {
				System.out.println("Hatalı seçim...");
			}
			
		}
		
	}
	
}
