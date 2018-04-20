package pl.tablice;

import java.util.Arrays;
import java.util.Scanner;

public class ZbieranieDanychTablica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile chcesz podać imion: ");
		int ilosc = sc.nextInt();
		sc.nextLine();
		
		String[] name =new String [ilosc];
		
		
		
		for(int i =0 ; i <ilosc ; i++) {
			System.out.println("Podaj imię: ");
			name[i]=sc.nextLine();
		}
		for(String imie: name) {
			System.out.println(imie );
		}
		System.out.println();
		
		Arrays.sort(name);
		for(String imie: name) {
			System.out.println(" imię to: "+ imie );
		}
		
		sc.close();
	}
}
