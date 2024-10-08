package homework_17.book.model;

//Создайте класс Book с полями:
//уникальный номер ISBN
//название title
//автор author
//год издания yearOfPublishing
//жанр genre
//В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
//который выводит информацию о книге. Создайте конструктор,
//в котором нет поля ISBN. Создайте конструктор,
//в котором есть только поля title, author и genre.
public class Book {

    //fields
    int isbn;
    String title;
    String author;
    int yearOfPublishing;
    String genre;



    //constructor

    public Book(int isbn, String title, String author, int yearOfPublishing, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //getters and setters


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void display() {
        System.out.println(String.format("ISBN: " + isbn + ", title:" + title + ", author: " + author + ", year of publishing: " + yearOfPublishing + ", genre: " + genre));
    }


}//end of class
