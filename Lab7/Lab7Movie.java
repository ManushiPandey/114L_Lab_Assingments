public class Lab7Movie {

    private String title;
    private int[] ratings;
    private int ratingCount;

    // this sets up the movie
    public Lab7Movie(String title) {
        this.title = title;
        ratings = new int[10];
        ratingCount = 0;
    }

    // this adds a rating if it is valid
    public void addRating(int rating) {

        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating");
            return;
        }

        if (ratingCount == ratings.length) {
            System.out.println("No more ratings can be added");
            return;
        }

        ratings[ratingCount] = rating;
        ratingCount++;
    }

    // this finds the average rating
    public double getAverageRating() {

        if (ratingCount == 0) {
            return 0.0;
        }

        int sum = 0;

        for (int i = 0; i < ratingCount; i++) {
            sum = sum + ratings[i];
        }

        return (double) sum / ratingCount;
    }

    // this finds the highest rating
    public int getHighestRating() {

        int highest = 0;

        for (int i = 0; i < ratingCount; i++) {
            if (ratings[i] > highest) {
                highest = ratings[i];
            }
        }

        return highest;
    }

    public String getTitle() {
        return title;
    }
}