import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}

public class EBookRentalSystem {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Little Women", "Louisa May Alcott", 5));
        books.add(new Book("Catching Fire", "Suzanne Collins", 5));
        books.add(new Book("Divergent", "Veronica Roth", 5));

        Scanner scanner = new Scanner(System.in);
        boolean continueRenting = true;

        while (continueRenting) {
            System.out.println("Charlie's Book House");

            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + " " + books.get(i).getTitle() + ", " + books.get(i).getAuthor() + " (" + books.get(i).getCopies() + " available)");
            }

            System.out.print("Choose a book: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= books.size()) {
                System.out.println("Invalid");
            } else if (books.get(index).getCopies() == 0) {
                System.out.println("Unavailable");
                System.out.printf("Do you need another book? Yes/No\n");
                String input = scanner.next();
                if (!input.equalsIgnoreCase("Yes")) {
                    continueRenting = false;
                }
            } else {
                books.get(index).setCopies(books.get(index).getCopies() - 1);
                System.out.println("Thank you for renting " + books.get(index).getTitle() + ".");
                System.out.printf("Do you need another book? Yes/No\n");
                String input = scanner.next();
                if (!input.equalsIgnoreCase("Yes")) {
                    continueRenting = false;
                }
            }
        }

        System.out.println("\nCome Again!");
        scanner.close();
    }
}
