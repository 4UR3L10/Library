package library;

public class BookList
{

    private BookNode list, last;

    BookList() // This constructor creates an empty list.
    {
        list = null;
    }

    void add(Book b)// pre-pending
    {
        BookNode temp = new BookNode(b);

        try
        {
            if (list == null)
            {
                list = temp;
                last = temp;
            } else
            {
                last.next = temp;
                last = temp;
            }
        } catch (NullPointerException e)
        {

        }
    }

    void insert(Book b) // Insert in proper place -- Sorting
    {
        BookNode temp = new BookNode(b);

        if (list == null)
        {
            list = temp;
        } else // It is not the first node
        {
            BookNode current = list,
                    back = null;
            boolean found = false;

            while (current != null && !found)
            {
                if (temp.book.getTitle().compareTo(current.book.getTitle()) < 0)
                {
                    found = true;
                } else
                {
                    back = current;
                    current = current.next;
                }
            }

            temp.next = current;

            if (back == null)
            {
                list = temp;
            } else
            {
                back.next = temp;
            }
        }
    }

    public String toString()
    {
        String result = "";
        BookNode current = list;

        while (current != null)
        {
            result += current.book.getTitle() + ",  ";
            current = current.next;
        }
        return result;
    }
}
