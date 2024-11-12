package homework_44.book;
import java.util.Objects;

//Создать класс «Книга» (Book). В классе должна храниться следующая информация:
//автор;
//название;
//год выпуска;
//жанр;
//страна издательства;
//цена.
public class Book {
    //fields
    private String author;
    private String title;
    private int yearOfPublication;
    private String genre;
    private String publisherCountry;
    private double price;

    public Book(String author, String title, int yearOfPublication, String genre, String publisherCountry, double price) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
        this.publisherCountry = publisherCountry;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisherCountry() {
        return publisherCountry;
    }

    public void setPublisherCountry(String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublication == book.yearOfPublication && Double.compare(book.price, price) == 0 && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(publisherCountry, book.publisherCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfPublication, genre, publisherCountry, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", genre='" + genre + '\'' +
                ", publisherCountry='" + publisherCountry + '\'' +
                ", price=" + price +
                '}';
    }
}