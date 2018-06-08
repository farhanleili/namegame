import java.util.Random;

public class TheGame {
	
	public static Boolean play(String[] name, Boolean verbose) {
		// Create a new random object
		Random rand = new Random();

		// Create the variables that will hold the random numbers
		int randomNumber1, randomNumber2;

		// Generate the random numbers
		do {
			randomNumber1 = rand.nextInt(name.length);
		} while (randomNumber1 % 2 != 0); // Check if the random number is odd or even. If the number is odd try again

		do {
			randomNumber2 = rand.nextInt(name.length);
		} while (randomNumber2 % 2 == 0); // Check if the random number is odd or even. If the number is even, try
											// again.

		// Print the randomly gfenerated name
		if (verbose)
			System.out.print("Random name is: " + name[randomNumber1] + "  " + name[randomNumber2]);

		// Check if the first and last names match.
		if (randomNumber2 == randomNumber1 + 1) {
			if (verbose)
				System.out.println("\t\tTrue");
			return true;
		} else {
			if (verbose)
				System.out.println("\t\tFalse");
			return false;
		}
	}
}
