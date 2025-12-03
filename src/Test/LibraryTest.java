package Test;

import S0411.Book;
import S0411.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
   void testNotNullListAfterAddingABook(){
        bookList.addBook(book1);
        assertNotNull(bookList.getBooksList());
   }

    @Test
    void testOfAddBook(){
        bookList.addBook(book1);
        bookList.addBook(book2);
        assertEquals(2,bookList.getBooksList().size());
    }

    @Test
    void testGetBookByIndex(){
        bookList.addBook(book1);
        bookList.addBook(book2);
        String getBook = bookList.getBookByIndex(0);
        assertEquals(getBook, book1.getTitle());
    }

}