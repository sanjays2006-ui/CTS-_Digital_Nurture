import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        List<Book> books = bookRepository.getBooks();
        System.out.println("Books in Library:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}