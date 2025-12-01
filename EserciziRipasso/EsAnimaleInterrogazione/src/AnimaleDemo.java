import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnimaleDemo {

	public static void main(String[] args){
		Scanner t = new Scanner(System.in);
		
		ArrayList<Animale> animali = new ArrayList<>();
		
		//CREAZIONE DUE ANIMALI STATICI
		Animale animale1 = new Animale("Cane", 3, 6);
		Animale animale2 = new Animale("Gatto", 6, 5.5);
		
		//INSERIMENTO DEI 2 ANIMALI NELL'ARRAY LIST
		animali.add(animale2); //ALMENO CONTROLLO CHE IL SORT FUNZIONI (Gatto viene dopo a Cane)
		animali.add(animale1);
		
		//SORT PER ORDINE ALFABETICO
		Collections.sort(animali);
		
		for (int i = 0; i < animali.size(); i++) {
			animali.get(i).scriviOutput();
			System.out.println("\n");
		}
		
		//CALCOLA CATEGORIE DI PESO
		int cat1 = 0, cat2 = 0, cat3 = 0;
		
		for (int i = 0; i < animali.size(); i++) {
			if(animali.get(i).getPeso() < 5) {
				cat1++;
				System.out.println("ANIMALE " + animali.get(i).getNome() + " sotto peso di 5 Kg");
			}
			else if(animali.get(i).getPeso() >= 5 && animali.get(i).getPeso() <= 10) {
				cat2++;
				System.out.println("ANIMALE " + animali.get(i).getNome() + " compreso fra 5 e 10 Kg");
			}
			else {
				cat3++;
				System.out.println("ANIMALE " + animali.get(i).getNome() + " maggiore di 10 Kg");
			}
		}
		
		System.out.println("PERCENTUALE ANIMALI SOTTO I 5Kg: " + ((cat1/animali.size()) * 100) + "%");
		System.out.println("PERCENTUALE ANIMALI COMPRESO FRA I 5 ED I 10 Kg: " + ((cat2/animali.size()) * 100) + "%");
		System.out.println("PERCENTUALE ANIMALI SOPRA I 10 Kg: " + ((cat3/animali.size()) * 100) + "%");
	}
}
