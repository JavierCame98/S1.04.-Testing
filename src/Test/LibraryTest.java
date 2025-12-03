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
    private Book book4;
    private Book book5;


    @BeforeEach
    public void setUp(){
        bookList = new Library();
        book1 = new Book("El Quijote");
        book2 = new Book("La divina Comedia");
        book3 = new Book("El capital");
        book4 = new Book("El Quijote");
        book5 = new Book("Decameron");
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
    void testAddingABookByIndex(){
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBookByIndex(book3, 1);
        Book bookIndex1 = bookList.getBooksList().get(1);
        String bookTitleIndex1 = bookIndex1.getTitle();
        assertEquals(book3.getTitle(), bookTitleIndex1);
    }

    @Test
    void testModifyTheListAddingABook(){
        bookList.addBook(book1);
        assertEquals(1, bookList.getBooksList().size());
        bookList.addBook(book3);
        assertEquals(2, bookList.getBooksList().size());
    }

    @Test
    void testGetBookByIndex(){
        bookList.addBook(book1);
        bookList.addBook(book2);
        String getBook = bookList.getBookByIndex(0);
        assertEquals(getBook, book1.getTitle());
    }

    @Test
    void testNotDuplicatedBooks(){
        bookList.addBook(book1);
        bookList.addBook(book4);
        assertEquals(1,bookList.getBooksList().size());
    }

    @Test
    void testRemovingABookReduceTheListSize(){
        bookList.addBook(book1);
        bookList.addBook(book2);
        assertEquals(2, bookList.getBooksList().size());
        bookList.addBook(book3);
        bookList.removeBookByTitle(book1.getTitle());
        assertEquals(2,bookList.getBooksList().size());
    }

    @Test
    void testTheBookListRemainsOrdered(){
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book5);
        String firstBook = bookList.getBookByIndex(0);
        assertEquals(book5.getTitle(),firstBook);
    }




}