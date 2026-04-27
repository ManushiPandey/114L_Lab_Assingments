public class Lab7Main1 {

    public static void main(String[] args) {

        // creating two books
        Lab7Book book1 = new Lab7Book("Java Basics", "John Smith", 100);
        Lab7Book book2 = new Lab7Book("Learning Code", "Amy Lee", 150);

        // reading some pages
        book1.readPages(25);
        book2.readPages(60);

        System.out.println(book1);
        System.out.println("Progress: " + book1.getProgress() + "%");

        System.out.println(book2);
        System.out.println("Progress: " + book2.getProgress() + "%");

        // reading to the end of book1
        book1.readPages(100);

        System.out.println(book1);
        System.out.println("Finished: " + book1.isFinished());
    }
}
