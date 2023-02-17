import java.util.Objects;

public class Book {
    private String title;
    private int publishingYear;
    private Author author;
    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title =title;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public Author getAuthor(){
        return author;
    }
    public void setAuthor(Author author) {
        this.author =author;
    }
    public void printInfo(){
        System.out.println(
                "Название книги:" + getTitle() + " год издания :" + getPublishingYear() +
                        " автор : " + getAuthor().getName() + " " + getAuthor().getSurname());

    }
    @Override
    public String toString(){
        return ("Название книги:" +title + " год издания :" + publishingYear+ "автор" + author);
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        int result = 14;
        return result + Objects.hash(title,publishingYear,author) * 2;
    }
}


