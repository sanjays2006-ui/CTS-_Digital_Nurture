import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Spring in Action"));
        books.add(new Book(2, "Clean Code"));
        return books;
    }
}