
package mypack;
import java.util.Scanner;

public class mbazarra_Assignment1 {
	public static String getRandomColor() {
        int randomNum = (int) (Math.random() * 5);
        switch (randomNum) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Orange";
            case 4:
                return "Yellow";
            default:
            	return "Red";
        }
    }

    public static boolean validateColor(String color) {
        return color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Green") || color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Orange") || color.equalsIgnoreCase("Yellow");
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        System.out.println(name + "\n" + description + "\nDue Date: " + dueDate);
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        int correct = startGame();

        System.out.println("\nGame Over");
        System.out.println("\nYou guessed " + correct + " out of 11 colors correctly.");
    }

    public static int startGame() {
        final String red = "Red";
        final String green = "Green";
        final String blue = "Blue";
        final String orange = "Orange";
        final String yellow = "Yellow";

        Scanner scanner = new Scanner(System.in);
        int correct = 0;

        for (int round = 1; round <= 11; round++) {
            System.out.println("Round " + round);
            String color = getRandomColor();
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            while (!validateColor(guess)) {
                System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                System.out.print("Enter your guess again: ");
                guess = scanner.nextLine();
            }

            if (guess.equalsIgnoreCase(color)) {
                System.out.println("\nI was thinking of " + color + ".");
                correct++;
            } else {
                System.out.println("\nI was thinking of " + color + ".");
            }
        }

        return correct;
    }

    

}
