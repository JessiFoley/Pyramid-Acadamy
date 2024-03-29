import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int input = 0;

        System.out.println("You are in a land full of dragons. In front of you, ");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into?(1 or 2)");

        do {
            try {
                input = getInput.nextInt();

                if (input != 1 && input != 2)
                    throw new IllegalArgumentException();

            } catch (Exception e) {
                System.out.println("Input is not 1 or 2.\nPlease enter 1 or 2");
            }
            getInput.nextLine();
        } while (input != 1 && input != 2);

        if (input == 1) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        } else {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("He drops a pile of money on the ground for you!");
        }
        
        getInput.close();
    }
}
