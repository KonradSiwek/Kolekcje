package pl.tablice;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ZbieranieDanychZbior {

    public static void main(String[] args) {
   	 Set<String> imiona = new HashSet<>();
   	 
   	 for(;;) {
   		 String imie = JOptionPane.showInputDialog("Podaj kolejne imię");
   		 if(imie == null) {
   			 break;
   		 }
   		 imiona.add(imie);
   	 }
   	 
   	 System.out.println("Zebrałem " + imiona.size() + " imion.");
   	 System.out.println("Imiona: " + imiona);
    }
}



