package S0411;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<Book> booksList;

    public Library (){
        booksList = new ArrayList<>();
    }

    public void addBook(Book book){
        if(book == null){
            return;
        }
        if(booksList.contains(book)){
            return;
        }
        booksList.add(book);
        Collections.sort(booksList);
    }

    public List<Book> getBooksList (){
        return new ArrayList<>(booksList);
    }

    public String getBookByIndex(int index){
        if(index < 0 || index >= booksList.size()){
            throw new IllegalArgumentException("");
        }
        Book book = booksList.get(index);
        return book.getTitle();
    }

    public boolean addBookByIndex(Book b, int index){
        if(index < 0 || index >= booksList.size()){
                return false;
        }
        booksList.add(index, b);
        return true;
    }

    public boolean removeBookByTitle(String title) {
        if(title == null || title.isEmpty()){
            return false;
        }
        for (int i = 0; i < booksList.size(); i++) {
            Book book = booksList.get(i);
            if (book.getTitle().equals(title)) {
                booksList.remove(i);
                return true;
            }

        }
        return false;
    }
}
