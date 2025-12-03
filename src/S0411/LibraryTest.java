package S0411;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    private Library bookList;
    private Book book1;
    private Book book2;
    private Book book3;


    @BeforeEach
    public void setUp(){
        bookList = new Library();
        book1 = new Book("El Quijote");
        book2 = new Book("La divina Comedia");
        book3 = new Book("El capital");
    }

    @Test
    void testOfAddBook(){
        bookList.addBook(book1);
        assertEquals(1, bookList.size());
    }

}