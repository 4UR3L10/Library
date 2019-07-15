package library;

public class Library
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create a book list object.
        BookList books = new BookList();

        books.insert(new Book("Danger on the Waters"));
        books.insert(new Book("Paradise Lost"));
        books.insert(new Book("Building Bridges"));
        books.insert(new Book("Hall Mark of Fame"));

        System.out.println(books.toString());
    }
}
