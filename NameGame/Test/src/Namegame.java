import java.util.Random;
import java.util.Scanner;

public class Namegame {
	public static void main(String[] args) throws InterruptedException {
		//Create the list of names, notice that the index of every first name will be odd and the index of every last name will be even.
		String[] name = {"Alex", "Jonsson" , "Farhan", "Leili", "Donald", "Trump"} ; 
		
		//Print all the names
		System.out.println("Namegame" );
		for (int i = 0;i<name.length;i++) {
			if (i<name.length-1)
			System.out.println(name[i] +" "+ name[i+1]);
		}
	
		Scanner reader = new Scanner(System.in); 
		System.out.println("Run the names ho wmany times? ");
		int n = reader.nextInt();
		reader.close();
		
		
		for (int i=0;i<n;i++) {
		play(name);
		Thread.sleep(4);
		}
	}

	private static void play(String[] name) {
		//Create a new random object
		Random rand = new Random();
		
		//Create the variables that will hold the random numbers
		int randomNumber1, randomNumber2;
		
		//Generate the random numbers
		do {
		randomNumber1 = rand.nextInt(name.length);
		}while (randomNumber1%2!=0); //Check if the random number is odd or even. If the number is odd try again
		
		do {
		randomNumber2 = rand.nextInt(name.length);
		}while(randomNumber2%2==0); //Check if the random number is odd or even. If the number is even, try again.
		
		//Print the randomly gfenerated name
		System.out.print("Random name is: " + name[randomNumber1] + "  " + name[randomNumber2]);

		//Check if the first and last names match.
		if (randomNumber2==randomNumber1+1)
			System.out.println("\t\tTrue");
		else
			System.out.println("\t\tFalse");
	}
}





