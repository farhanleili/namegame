import java.util.Random;

public class Namegame {
	public static void main(String[] args) {
		System.out.println("Hej, Name game " );

		String[] firstname = {"Alex" , "Farhan" } ;
		String[] lastname = {"Jonsson" , "Leili" };

		Random rand = new Random();

		int randomNumber1 = rand.nextInt(firstname.length);
		int randomNumber2 = rand.nextInt(firstname.length);
		
		System.out.println("Random name is: " + firstname[randomNumber1] + "  " + lastname[randomNumber2]);

		if ( firstname[randomNumber1] == firstname[0] && lastname[randomNumber2] == lastname[0] || firstname[randomNumber1] == firstname[1] && lastname[randomNumber2] == lastname[1])
		{
			System.out.println("right");
		}
		else {
			System.out.println("false");
		}		

	}
}





