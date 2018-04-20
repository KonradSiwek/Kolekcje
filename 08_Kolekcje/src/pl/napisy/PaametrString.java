package pl.napisy;

public class PaametrString {
	// Klasa String jest immutable , nie zmienia się 
	// Jeżeli dodajemy do niej napis to tworzymy nowy obiekt 
	// natomiast gdy zmieniamy obiekt StringBuilder to przez metodę append zmieniamy
	//	utworzony obiekt w metodzie main
	
	static void metoda(String s, StringBuilder sb) {
		s+= " ma kota";
		sb.append(" ma kota");
		System.out.println("s: " +s);
	}
public static void main(String[] args) {
	String a = "Ala";
	String b = a;
	StringBuilder sb = new StringBuilder("Ola");
	System.out.println("a: " + a);
	System.out.println("b: "+ b);
	System.out.println("sb: " + sb);
	
	System.out.println();
	
	metoda(a, sb);
	
	System.out.println("a: " + a);
	System.out.println("b: "+ b);
	System.out.println("sb: " + sb);
	System.out.println();
	
	
}
}
