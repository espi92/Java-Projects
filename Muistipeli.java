import java.util.Random;
import java.util.Scanner;

public class Muistipeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random random = new Random();
	Scanner in = new Scanner(System.in);
	int vaaratVastaukset = 0;
	double oikeaOsuus = 0;
	
	int [] arvotutNumerot = new int [7]; // Ohjelma ensin arpoo 7 numeroa v‰lilt‰ 1-5 ja n‰ytt‰‰ ne k‰ytt‰j‰lle
	int [] arvatutNumerot = new int [7];
	
	for (int i = 0 ; i < arvotutNumerot.length ; i++)
	{
		arvotutNumerot[i] = random.nextInt(5)+1;
	}
	
	System.out.println("Yrit‰ muistaa alla olevat numerot. N‰et numerot 3 sekunnin ajan!");
	
	for (int i = 0 ; i < arvotutNumerot.length ; i++ )
	{
		System.out.print(" "+ arvotutNumerot[i]); // Numeroita n‰ytet‰‰n 3 sekuntia
	}
	System.out.println("\t(3 sekunnin j‰lkeen ruutu tyhjennet‰‰n)");
	
	try // Numeroita n‰ytet‰‰n 3 sekuntia
	{
		Thread.sleep(3000);	
	}
	catch(InterruptedException ex)
	{
		Thread.currentThread().interrupt(); // T‰m‰n j‰lkeen ruutu tyhjennet‰‰n
	}
	
	for (int i = 0; i < 20; ++i) System.out.println();
	// Koodi lis‰‰ 20 tyhj‰‰ v‰lilyˆnti‰ ja n‰in konsoli n‰ytt‰‰ tyhjentyv‰n

	for (int i = 0 ; i < arvatutNumerot.length ; i++) // K‰ytt‰j‰ syˆtt‰‰ muistelemansa numerot yksitellen
	{
		System.out.println("Syˆt‰ " + (i+1) + ". numero");
		arvatutNumerot[i] = Integer.parseInt(in.nextLine());
		if (arvatutNumerot[i] < 1 || arvatutNumerot[i] > 5)
		{
			System.out.println("Virhe!");
		}
	}	
	
	System.out.println("\n");
	
	System.out.print("Oikeat numerot olivat: "); // Lopuksi ohjelma kertoo miten k‰vi
	for (int i = 0 ; i < arvotutNumerot.length ; i++)
	{
		System.out.print(" "+ arvotutNumerot[i]);
	}
	
	System.out.println("\n");
	
	System.out.print("Sinun numerosi olivat: ");
	
	for (int i = 0 ; i < arvatutNumerot.length ; i++)
	{
		System.out.print(" " + arvatutNumerot[i]);
	}
	
	for (int i = 0 ; i < arvotutNumerot.length ; i++) // Monta vastausta meni v‰‰rin?
	{
		if (arvotutNumerot[i] != arvatutNumerot[i])
		{
			vaaratVastaukset = vaaratVastaukset + 1;
		}
	}
	System.out.println("\n");
	System.out.print("V‰‰r‰t vastukset: " + vaaratVastaukset);
	
	for (int i = 0 ; i < arvatutNumerot.length ; i++) // Kuinka monta prosenttia vastauksista oli
	{												  // oikein?
		if (arvotutNumerot[i] == arvatutNumerot[i])
		{
			oikeaOsuus++;
		}
	}
	System.out.println("\n");
	System.out.printf("Oikeita vastauksia:  %3.1f%%", ((oikeaOsuus/7)*100));
	// "System.out.print("Oikeita vastauksia: " + ((oikeaOsuus/7)*100) + "%");"
}
}
