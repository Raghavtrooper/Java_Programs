class Book {
    String title;
    String author;
    int publicationYear;

    public Book() {
        title = "Untitled";
        author = "Unknown Author";
        publicationYear = 0;
    }

    public Book(String titles, String authors) {
        title = titles;
        author = authors;
        publicationYear = 0;
    }

    public Book(String titl, String autho, int publicationYea) {
        title = titl;
        author = autho;
        publicationYear = publicationYea;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (publicationYear != 0) {
            System.out.println("Publication Year: " + publicationYear);
        } else {
            System.out.println("Publication Year: Not Specified");
        }
    }

    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayDetails();

        System.out.println();

        // Using constructor with title and author
        Book customBook1 = new Book("singham", "rohit shetyy");
        System.out.println("Custom Book 1 Details:");
        customBook1.displayDetails();

        System.out.println();

        // Using constructor with title, author, and publication year
        Book customBook2 = new Book("bahubali", "I dont know", 2018);
        System.out.println("Custom Book 2 Details:");
        customBook2.displayDetails();
    }
}
