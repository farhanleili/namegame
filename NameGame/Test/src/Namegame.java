import java.util.Random;

public class Namegame {
	public static void main(String[] args) {
		System.out.println("Hej, Name game " );

		String[] firstname = {"Alex" , "Farhan" } ;
		String[] lastname = {"Jonsson" , "Leili" };

		Random rand = new Random();

		System.out.println(firstname[rand.nextInt(2)] + "  " + lastname[rand.nextInt(2)]);

		if ( firstname[rand.nextInt(2)] == firstname[0] && lastname[rand.nextInt(2)] == lastname[0])
		{
			System.out.println("right");
		}

		else if ( firstname[rand.nextInt(2)] == firstname[1] && lastname[rand.nextInt(2)] == lastname[1])
		{
			System.out.println("right");
		}

		else {
			System.out.println("false");
		}		

	}
}





