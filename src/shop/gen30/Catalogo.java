package shop.gen30;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto[] catalogo = new Prodotto[0];
		Scanner s = new Scanner(System.in);
		
		String userChoise = "";
		while (!userChoise.equals("4")) {
			System.out.println("what do you want to add to your catalogue?");
			System.out.println("1 - smartphone");
			System.out.println("2 - television");
			System.out.println("3 - earphone");
			System.out.println("4 - nothing");
			userChoise = s.nextLine().trim();
			if (userChoise.equals("1")) {
				Prodotto smartphone = new Smartphone("mm", "mm", "IMEI00001", 1000);
				smartphone.setPrice(10);
				System.out.println(smartphone.toString());
				catalogo = Arrays.copyOf(catalogo, catalogo.length + 1);
				catalogo[catalogo.length - 1] = smartphone;
			} else if (userChoise.equals("2")) {
				Prodotto tv = new Televisore("mm", "mm", "grande", true);
				tv.setPrice(10);
				System.out.println(tv.toString());
				catalogo = Arrays.copyOf(catalogo, catalogo.length + 1);
				catalogo[catalogo.length - 1] = tv;
			} else if (userChoise.equals("3")) {
				Prodotto earphone = new Cuffia("mm", "mm", "giallo", true);
				earphone.setPrice(10);
				System.out.println(earphone.toString());
				catalogo = Arrays.copyOf(catalogo, catalogo.length + 1);
				catalogo[catalogo.length - 1] = earphone;
			} else if (!userChoise.equals("4")) {
				System.out.println("Your choise is invalid");
			}

		}
		s.close();// da integrare1
		System.out.println("Your list:");
		for (Object n : catalogo)
			System.out.println(n);

		// Televisore tel = new Televisore("mm","mm","grande",true);
		// tel.setPrice(10);
		// System.out.println(tel.toString());
	}

}
/*
 * Un prodotto è caratterizzato da: - codice (numero intero) - nome - marca -
 * prezzo - iva Usate opportunamente i livelli di accesso (public, private), i
 * costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità”
 * per fare in modo che: - il codice prodotto sia accessibile solo in lettura -
 * gli altri attributi siano accessibili sia in lettura che in scrittura - il
 * prodotto esponga sia un metodo per avere il prezzo base che uno per avere il
 * prezzo comprensivo di iva formattato Lo shop gestisce diversi tipi di
 * prodotto: - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità
 * di memoria - Televisori, caratterizzati dalle dimensioni e dalla proprietà di
 * essere smart oppure no - Cuffie, caratterizzate dal colore e se sono wireless
 * o cablate Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto
 * nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
 * BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente
 * di valorizzare un catalogo di prodotti con dati inseriti tramite scanner.
 * Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo
 * uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente
 * utilizzate il costruttore opportuno. Al termine dell’inserimento stampate il
 * catalogo (fate l’override del metodo toString per restituire le informazioni
 * da stampare per ogni classe)
 */