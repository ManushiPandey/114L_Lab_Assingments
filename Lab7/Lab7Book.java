public class Lab7Book {

    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    // this sets up the book
    public Lab7Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        currentPage = 0;
    }

    // this reads pages but does not go past the end
    public void readPages(int pages) {
        currentPage = currentPage + pages;

        if (currentPage > totalPages) {
            currentPage = totalPages;
        }

        System.out.println("Current page: " + currentPage + " out of " + totalPages);
    }

    // this gives the percent read
    public double getProgress() {
        return (currentPage * 100.0) / totalPages;
    }

    // this checks if the book is finished
    public boolean isFinished() {
        return currentPage == totalPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public String toString() {
        return title + " by " + author + ", pages read: " + currentPage + "/" + totalPages;
    }
}