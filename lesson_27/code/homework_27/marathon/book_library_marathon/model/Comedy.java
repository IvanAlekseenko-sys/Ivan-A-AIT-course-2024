package homework_27.marathon.book_library_marathon.model;

public class Comedy extends Book {
    //fields
    private String humorType;

    public Comedy(String title, String author, long isbn, int yearOfPublishing, String humorType) {
        super(title, author, isbn, yearOfPublishing);
        this.humorType = humorType;

    }

    public String getHumorType() {
        return humorType;
    }

    public void setHumorType(String humorType) {
        this.humorType = humorType;
    }

    @Override
    public String toString() {
        return "Comedy{" +
                "humorType='" + humorType + '\'' +
                "} " + super.toString();
    }
}
