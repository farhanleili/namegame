import java.util.Random;

public class Namegame {
	public static void main(String[] args) {
		System.out.println("Hej, Name game " );

		String[] firstname = {"Alex", "Jonsson" , "Farhan", "Leili" } ;

		Random rand = new Random();

		int randomNumber1 = rand.nextInt(firstname.length);
		int randomNumber2 = rand.nextInt(firstname.length);
		
		System.out.println("Random name is: " + firstname[randomNumber1] + "  " + firstname[randomNumber2]);

		if (randomNumber2==randomNumber1+1){
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}
}





