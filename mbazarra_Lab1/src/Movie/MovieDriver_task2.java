package Movie;
import java.util.Scanner;

public class MovieDriver_task2 {
	
	public static void main(String[] args) {
        
		Scanner keyboard = new Scanner(System.in);
        Movie movie = new Movie();
        String input = "y";

        while (input.equalsIgnoreCase("y")) {
            System.out.print("Enter the name of a movie: ");
            String name = keyboard.nextLine();
            movie.setTitle(name);

            System.out.print("Enter the rating of the movie: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.print("Enter number of tickets sold for this movie");
            int sold = keyboard.nextInt();
            movie.setSoldTickets(sold);

            keyboard.nextLine();  // Consume the newline character

            System.out.println(movie.toString());

            System.out.print("Do you want to enter another? (y or n): ");
            input = keyboard.nextLine();
        }

        System.out.println("\nGoodbye");
        keyboard.close();
    }
	

}
