package notuygulamasi;

import java.util.ArrayList;
import java.util.Stack;

public class Database {

	// list   ArrayList
	//    get(index)
	// set   HashSet
	// 	her elemandan bir tane 
	// map  HashMap
	// key(set) value(list)
	
	public static final ArrayList<Not> NOTLAR = new ArrayList<Not>();
	public static final Stack<Not> GUNCELLEMELER = new Stack<Not>();
	
	
	
	public static void notlarTablosunuYazdir() {
		
		for (int i = 0; i < NOTLAR.size(); i++) {
			System.out.println(i + " -> " + NOTLAR.get(i));
		}
		
	}



	public static void raporVer() {
		
		int size = GUNCELLEMELER.size();
		
		for(int i = 0; i < size; i++) {
			System.out.println(GUNCELLEMELER.pop().gecmisliToString());
		}
		
	}
	
	
	
}
