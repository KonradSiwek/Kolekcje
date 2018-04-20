package pl.napisy;

public class TworzenieNapisów {
static String kolejneLiczny(int n) {
	String wynik = " ";
	int [] in = new int[n];
	int i = 1;
	for (int j : in) {
		wynik= wynik +i++ + " ";
	}
	return wynik;
	
	
}
static String kolejneLiczbySB(int n) {
	StringBuilder sb = new StringBuilder();

	for(int i =0; i<=n; i++) {
		sb.append(i+ ',');
	}
	return sb.toString();
	
}

	public static void main(String[] args) {
		System.out.println(kolejneLiczny(8));
		String wynik2 = kolejneLiczbySB(50000);
		System.out.println("Koniec");
		System.out.println("długość napisu: " + wynik2.length());
		String wynik = kolejneLiczny(50000);
		System.out.println("Koniec");
		System.out.println("długość napisu: " + wynik.length());
		
		
		
	}
}
