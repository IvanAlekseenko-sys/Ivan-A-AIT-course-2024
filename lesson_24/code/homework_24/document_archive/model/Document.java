package homework_24.document_archive.model;

import java.util.Objects;

//Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.
public class Document {
    public static final int ID_LENGTH = 10;

    //fields
    private int id; //содержит 10 цифр
    private String author;
    private int yearOfIssue;


    //constructor

    public Document(int id, String author, int yearOfIssue) {
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.id = checkId(id);
    }

    private int checkId(int id) {
        //будем проверять id по количеству цифр в этом числе
        if (countDigit(id)) {
            return id;
        }
        return -1; // Возвращаем, например, -1, если количество цифр неверно
    }

    private boolean countDigit(int id) {
        int count = 0;
        int temp = id; // чтобы не "испортить" значение id
        while ((temp != 0)) {
            temp = temp / 10;
            count++;
        }
        return count == ID_LENGTH;
    }

    //getters and setters


    public int getId() {
        return id;
    }

    // предусмотреть защиту по поводу 10 цифр и в этом случае
    public void setId(int id) {
        if (checkId(id) > 0) {
            this.id = checkId(id);
        } else {
            System.out.println("id is not correct.");
        }

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return id == document.id && yearOfIssue == document.yearOfIssue && Objects.equals(author, document.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, yearOfIssue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("id=").append(id);
        sb.append(", author='").append(author).append('\'');
        sb.append(", yearOfIssue=").append(yearOfIssue);
        sb.append('}');
        return sb.toString();
    }
}
