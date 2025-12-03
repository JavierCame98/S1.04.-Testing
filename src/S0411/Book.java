package S0411;

public class Book implements Comparable<Book> {

    private String title;

    public Book (String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public int compareTo(Book book) {
        return this.getTitle().compareTo(book.getTitle());
    }
}
