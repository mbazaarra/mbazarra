package Movie;
import java.util.Scanner;


public class MovieDriver { 

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Movie movie = new Movie();
       
        
        
       
        
        System.out.println("Enter the name of a movie: ");
        String name = keyboard.nextLine();
        movie.setTitle(name);

        System.out.println("Enter the rating of movie: ");
        String rating = keyboard.nextLine();
        movie.setRating(rating);


        System.out.println("Enter number of tickets sold for this movie");
        int sold = keyboard.nextInt();
        movie.setSoldTickets(sold);

        
        
        
        System.out.println("\nGoodbye");
        keyboard.close();
    }
    

	
}
