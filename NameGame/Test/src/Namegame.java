import java.util.Random;

public class Namegame {
	public static void main(String[] args) {
		System.out.println("Hej, Name game " );

		//Create the list of names, notice that the index of every first name will be odd and the index of every last name will be even.
		String[] name = {"Alex", "Jonsson" , "Farhan", "Leili", "Donald", "Trump"} ; 

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
		System.out.println("Random name is: " + name[randomNumber1] + "  " + name[randomNumber2]);

		//Check if the first and last names match.
		if (randomNumber2==randomNumber1+1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}





