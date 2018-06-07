import java.util.Random;
import java.util.Scanner;

public class Namegame {
	public static void main(String[] args) throws InterruptedException {
		// Create the list of names, notice that the index of every first name will be
		// odd and the index of every last name will be even.
		String[] name = { "Alex", "Jonsson", "Farhan", "Leili", "Donald", "Trump", "Jordan", "Peterson", "Luke",
				"Smith" };

		// Print all the names
		System.out.println("Namegame\nThese are the possible correct names");
		for (int i = 0; i < name.length; i++) {
			if (i < name.length - 1)
				System.out.println(name[i] + " " + name[i + 1]);
		}

		Scanner reader = new Scanner(System.in);
		System.out.print("Run the names how many times? ");
		int n = reader.nextInt();
		reader.nextLine();
		System.out.print("Verbose? [y/n] ");
		Boolean verbose = false;
		if (reader.next().charAt(0) == 'y')
			verbose = true;
		reader.close();

		if (!verbose)
			System.out.println("Running silent...");
		int countF = 0, countT = 0;
		for (int i = 0; i < n; i++) {
			if (play(name, verbose))
				countT++;
			else
				countF++;
			// Thread.sleep(4);
		}
		System.out.println("Total correct names:\t" + countT + " (" + countT * 100 / n + "%)");
		System.out.println("Total false names: \t" + countF + " (" + countF * 100 / n + "%)");
	}

	private static Boolean play(String[] name, Boolean verbose) {
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
