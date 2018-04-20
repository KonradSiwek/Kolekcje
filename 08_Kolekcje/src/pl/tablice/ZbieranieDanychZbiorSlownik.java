package pl.tablice;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ZbieranieDanychZbiorSlownik {

    public static void main(String[] args) {
   	 Map<String, Integer> slownik = new HashMap<>();
   	 
   	 for(;;) {
   		 String imie = JOptionPane.showInputDialog("Podaj kolejne imię");
   		 if(imie == null) {
   			 break;
   		 }
   		 int wiek = Integer.parseInt(JOptionPane.showInputDialog("Ile lat ma " + imie + "?"));
   		 slownik.put(imie, wiek);
   	 }
   	 
   	 System.out.println("Zebrałem " + slownik.size() + " imion.");
   	 System.out.println("Dane: " + slownik);
   	 
   	 while(true) {
   		 String imie = JOptionPane.showInputDialog("Podaj imię osoby, której wiek chcesz odczytać");
   		 if(imie == null) {
   			 break;
   		 }
   		 // ważne, aby ta zmienna była typu Integer a nie int, bo może się zdarzyć null
   		 Integer wiek = slownik.get(imie);
   		 if(wiek == null) {
   			 JOptionPane.showMessageDialog(null, "Brak danych dla osoby o imieniu " + imie);
   		 } else {
   			 JOptionPane.showMessageDialog(null, imie + " ma " + wiek + " lat.");
   		 }
   	 }
    }
}



