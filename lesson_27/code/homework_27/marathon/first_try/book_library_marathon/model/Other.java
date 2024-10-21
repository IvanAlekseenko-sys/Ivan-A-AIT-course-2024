package homework_27.marathon.first_try.book_library_marathon.model;

public class Other extends Book {

    //fields
    private String Genre;

    //constructor
    public Other(String title, String author, long isbn, int yearOfPublishing, String Genre) {
        super(title, author, isbn, yearOfPublishing);
        this.Genre = Genre;
    }

    //getters & setters
    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public String toString() {
        return "Other{" +
                "Genre='" + Genre + '\'' +
                "} " + super.toString();
    }
}
