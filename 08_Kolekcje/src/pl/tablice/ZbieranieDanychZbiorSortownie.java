package pl.tablice;

import java.text.Collator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class ZbieranieDanychZbiorSortownie {

    public static void main(String[] args) {
   	 Set<String> imiona = new TreeSet<>(Collator.getInstance());
   	 
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



