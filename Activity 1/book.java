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

    public String getAuthor() {
        return author;
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
        Book[] books = {
                new Book("Little Women", "Louisa May Alcott", 5),
                new Book("Catching Fire", "Suzanne Collins", 5),
                new Book("Divergent", "Veronica Roth", 5)
        };

        Scanner scanner = new Scanner(System.in);
        boolean continueRenting = true;

        while (continueRenting) {
            System.out.println("Charlie's Book House");

            for (int i = 0; i < books.length; i++) {
                System.out.println((i + 1) + " " + books[i].getTitle() + ", " + books[i].getAuthor() + " (" + books[i].getCopies() + " available)");
            }

            System.out.print("Choose a book: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= books.length) {
                System.out.println("Invalid");
            } else if (books[index].getCopies() == 0) {
                System.out.println("Unavailable");
                System.out.printf("Do you need another book? Yes/No\n");
                String input = scanner.next();
                if (!input.equalsIgnoreCase("Yes")) {
                    continueRenting = false;
                }
            } else {
                books[index].setCopies(books[index].getCopies() - 1);
                System.out.println("Thank you for renting " + books[index].getTitle() + ".");
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
