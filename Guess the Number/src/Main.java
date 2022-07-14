import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		String name = "";
		String again = "y";
		int guess = 0;
		int secNum = 0;
		int c = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello! What is your name?");
		name = input.nextLine();
		
		while (again.equals("y")) {
			System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
			secNum = rand.nextInt(20) + 1;
			
			guess = 0;
			c = 1;
			again = "y";
		
			while (c < 6 && guess != secNum) {
				System.out.println("Take a guess.");
				guess = input.nextInt();
			
				if (guess > secNum)
					System.out.println("Your guess is too high.");
				else if (guess < secNum)
					System.out.println("Your guess is too low.");
				else
					System.out.println("Good job, " + name + "! You guessed my number in " + c + " guesses!");
			
				c++;
			}
		
			System.out.println("Would you like to play again? (y or n)");
			input.nextLine();
			again = input.nextLine();
		}
		
		input.close();
		
	}

}
