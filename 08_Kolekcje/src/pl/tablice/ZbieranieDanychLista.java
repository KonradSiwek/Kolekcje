package pl.tablice;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ZbieranieDanychLista {

    public static void main(String[] args) {
   	 List<String> imiona = new ArrayList<>();

   	 for(int i = 1;; i++) {
   		 String imie = JOptionPane.showInputDialog("Podaj " + i + ". imię...");
   		 if(imie == null) {
   			 break;
   		 }
   		 imiona.add(imie);
   	 }

   	 System.out.println("Zebrałem " + imiona.size() + " imion.");
   	 System.out.println("Imiona: " + imiona);

   	 Collections.sort(imiona);
   	 System.out.println("Posortowane: " + imiona);
   	 
   	 Collections.shuffle(imiona);
   	 System.out.println("Metoda shuffle: "+imiona);
   	 
   	 imiona.sort(null);
   	 System.out.println("Sortownanie na konkretnej liśćie: "+imiona);
   	 
   	 System.out.println();
   	 
   	 imiona.sort(Collator.getInstance());
   	 
   	 System.out.println("Posortowane na liście i z Collator.getInstance()"+ imiona );
   	imiona.sort(Collator.getInstance(Locale.FRENCH));
  	 
  	 System.out.println("Posortowane na liście i z Collator.getInstance(Locale.FRENCH)" + imiona);
  	 imiona.sort(Collator.getInstance(new Locale("pl","PL")));
  	 System.out.println();
  	 
  	 System.out.println("Posortowane po PL" + imiona);
   	 
    }

}



