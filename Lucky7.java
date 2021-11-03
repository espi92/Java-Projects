import java.util.Random;
import java.util.Scanner;
public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Random random = new Random();
	Scanner in = new Scanner (System.in);
	int randomNumber1; // Tee peli, joka arpoo 3 numeroa v‰lilt‰ 1-10 ja tulostaa numerot
	int randomNumber2;
	int randomNumber3;
	int raha;
	String pelataanko;
	raha = 0; // Lis‰‰ rahat peliin
	
	System.out.println("Syˆt‰ rahasumma "); // Pelaaja voi alussa syˆtt‰‰ raham‰‰r‰n, jolla pelaa
	raha = Integer.parseInt(in.nextLine());
	
	do
	{
	--raha; // Joka peli maksaa euron
	
	randomNumber1 = random.nextInt(10)+1; 
	randomNumber2 = random.nextInt(10)+1;
	randomNumber3 = random.nextInt(10)+1;
										// Tee peli, joka arpoo 3 numeroa v‰lilt‰ 1-10 ja tulostaa numerot
	System.out.println(randomNumber1);
	System.out.println(randomNumber2);
	System.out.println(randomNumber3);
	
	// Jos joku numeroista on seitsem‰n, kerro k‰ytt‰j‰lle, ett‰ voitit
	if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7)
	{
		raha = raha + 1;								// Jos yksi arvotuista numeroista on seitsem‰n, pelaaja voittaa euron
		System.out.println("Voitit!"); 					// Jos kaksi numeroa on seitsem‰n, h‰n voittaa 2 euroa jne
		System.out.println("Rahaa j‰ljell‰: " + raha);
	}
	
	// Jos mik‰‰n ei ole seitsem‰n, kerro k‰ytt‰j‰lle, ett‰ h‰visit
	else
	{
		System.out.println("H‰visit!"); 
		System.out.println("Rahaa j‰ljell‰: " + raha);
	}
	
	System.out.println("Pelataanko uudestaan? (k/e)"); // Yhden pelikerran j‰lkeen kysyt‰‰n:
	pelataanko = in.nextLine();						   // "Haluatko pelata uudestaan?
	
	} while (pelataanko.contentEquals("k") && raha > 0); // Kun kaikki rahat ovat loppuneet, peli loppuu
														 // Jos haluat pelata, kirjoita k ja paina Enter
														 // Jos et halua pelata, kirjoita e ja paina Enter
	System.out.println("Peli p‰‰ttyi"); // Lopuksi ohjelma loppuu
		
	}
}
