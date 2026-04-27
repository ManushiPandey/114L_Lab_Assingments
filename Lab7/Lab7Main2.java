public class Lab7Main2 {

    public static void main(String[] args) {

        // creating two movies
        Lab7Movie movie1 = new Lab7Movie("Avengers");
        Lab7Movie movie2 = new Lab7Movie("Batman");

        // adding ratings for movie1
        movie1.addRating(5);
        movie1.addRating(4);
        movie1.addRating(6); // invalid rating

        // adding ratings for movie2
        movie2.addRating(3);
        movie2.addRating(5);
        movie2.addRating(4);

        System.out.println(movie1.getTitle());
        System.out.println("Average rating: " + movie1.getAverageRating());
        System.out.println("Highest rating: " + movie1.getHighestRating());

        System.out.println(movie2.getTitle());
        System.out.println("Average rating: " + movie2.getAverageRating());
        System.out.println("Highest rating: " + movie2.getHighestRating());
    }
}