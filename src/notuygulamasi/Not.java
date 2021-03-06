package notuygulamasi;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class Not {
	
	private String not;
	private LocalDateTime olustrulmaTarihi;
	private LocalDateTime sonGuncellenmeTarihi;
	private Queue<String> guncellemeGecmisi = new LinkedList<String>();

	public Not(String not) {
		this.not = not;
		this.olustrulmaTarihi = LocalDateTime.now();
		this.sonGuncellenmeTarihi = olustrulmaTarihi;
		this.guncellemeGecmisi.add(this.not);
	}

	public String getNot() {
		return not;
	}

	public void setNot(String not) {
		this.not = not;
	}

	public LocalDateTime getOlustrulmaTarihi() {
		return olustrulmaTarihi;
	}

	public void setOlustrulmaTarihi(LocalDateTime olustrulmaTarihi) {
		this.olustrulmaTarihi = olustrulmaTarihi;
	}

	public LocalDateTime getSonGuncellenmeTarihi() {
		return sonGuncellenmeTarihi;
	}

	public void setSonGuncellenmeTarihi(LocalDateTime sonGuncellenmeTarihi) {
		this.sonGuncellenmeTarihi = sonGuncellenmeTarihi;
	}

	public Queue<String> getGuncellemeGecmisi() {
		return guncellemeGecmisi;
	}

	public void setGuncellemeGecmisi(Queue<String> guncellemeGecmisi) {
		this.guncellemeGecmisi = guncellemeGecmisi;
	}
	
	@Override
	public String toString() {
		
		return this.not 
				+ "\n\t" 
				+ this.olustrulmaTarihi 
				+ "\n\t" 
				+ this.sonGuncellenmeTarihi;
	}

	public String gecmisliToString() {
		String info = this.toString() + "\n\n\tGeçmiş  ";
		
		for(String s : guncellemeGecmisi) {
			info +=  "\n\t\t\t" +s + "\n";
		}
		return info;
	}

}
