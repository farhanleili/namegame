import java.util.Random;

public class Namegame {
	public static void main(String[] args) {
		System.out.println("Hej, Name game " );

		String[] name = {"Alex", "Jonsson" , "Farhan", "Leili"} ;

		Random rand = new Random();

		int randomNumber1 = rand.nextInt(name.length);
		int randomNumber2 = rand.nextInt(name.length);
		
		System.out.println("Random name is: " + name[randomNumber1] + "  " + name[randomNumber2]);

		if (randomNumber2==randomNumber1+1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}





