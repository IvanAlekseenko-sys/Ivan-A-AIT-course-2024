package homework_27.marathon.first_try.book_library_marathon.controller;

import homework_27.marathon.first_try.book_library_marathon.model.Book;

public interface LibraryInterface {

    boolean addBook(Book book);

    void printBooks();

    Book findBook(long isbn);

    Book removeBook(long isbn);

    Book findBookByAuthor(String author);

    int size();
}
