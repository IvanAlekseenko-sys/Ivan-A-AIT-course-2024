package homework_27.marathon.first_try.book_library_marathon.model;

public class Thriller extends Book {

    private int tensionLevel;

    public int getTensionLevel() {
        return tensionLevel;
    }

    public void setTensionLevel(int tensionLevel) {
        this.tensionLevel = tensionLevel;
    }

    public Thriller(String title, String author, long isbn, int yearOfPublishing, int tensionLevel) {
        super(title, author, isbn, yearOfPublishing);
        this.tensionLevel = tensionLevel;


    }

    @Override
    public String toString() {
        return "Thriller{" +
                "tensionLevel=" + tensionLevel +
                "} " + super.toString();
    }
}
