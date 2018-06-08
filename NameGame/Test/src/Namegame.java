import java.util.Random;
import java.util.Scanner;

public class Namegame {
	public static void main(String[] args) throws InterruptedException {
		
		// Create the list of names, notice that the index of every first name will be
		// odd and the index of every last name will be even.
		String[] name = {
				"Alex", "Jonsson",
				"Farhan", "Leili",
				"Donald", "Trump",
				"Jordan", "Peterson",
				"Luke","Smith",
				"Göran", "Persson",
				"Carl", "Gustaf",
				"Fredrik", "Reinfeldt",
				"Eddie", "Meduza",
				"Börje", "Lundin"};

		// Print all the names
		System.out.println("Namegame\nThese are the possible correct names:");
		for (int i = 0; i < name.length; i++) {
			if (i < name.length - 1)
				System.out.println(name[i] + " " + name[i + 1]);
		}

		
		Scanner reader = new Scanner(System.in);
		System.out.print("\nRun the names how many times? ");
		int n = reader.nextInt(); //Read how many times you should run the name generation
		reader.nextLine(); //This is to clear the scanner from the buffered \n character
		System.out.print("Verbose? [y/n] "); //Ask if you want to get a verbose output or not
		Boolean verbose = false;
		if (reader.next().charAt(0) == 'y') //Check it
			verbose = true; 
		reader.close();

		if (!verbose)
			System.out.println("Running silent..."); //Only printed if verbose output is requested
		
		//In this part we call play() and count the results
		int countF = 0, countT = 0;
		for (int i = 0; i < n; i++) {
			if (TheGame.play(name, verbose)) //Here we call the play() method straight from the if statement, we can do it like this because play() returns true or false  
				countT++;
			else
				countF++;
		}
		//Here we report the results of our run.
		System.out.println("Total correct names:\t" + countT + " (" + countT * 100 / n + "%)");
		System.out.println("Total false names: \t" + countF + " (" + countF * 100 / n + "%)");
	}
}