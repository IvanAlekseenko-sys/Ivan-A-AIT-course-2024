//package classwork_23.book_library.controller;
//
//import classwork_23.book_library.model.Book;
//
//public class Library {
//
//    // fields
//    private Book[] books;
//    private int size; // текущее кол-во книг
//
//
//    // constructor
//    public Library(int capacity) {
//        this.books = new Book[capacity];
//        this.size = 0;
//    }
//
//    // CRUD methods
//
//    public boolean addBook(Book book) {
//        //negative cases
//        if(book==null){
//            return false;
//        }
//
//        if(size == books.length) {
//            return false;
//        }
//        if(){
//            return false;
//        }
//        //positive case
//        books[size] = book; //ставим в конец массива, первое свободное место, значение этого индекса и есть size
//        size++;
//        return true;
//    }
//    // size++
//
//    public void printBooks() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(books[i]);
//        }
//    }
//
//
////    public Book findBook(long isbn) {
////
////        Book foundBook = null;
////
////        return foundBook;
////    }
//
//
//    public Book removeBook(long isbn) {
//        return null;
//    }
//    // size--
//
//    // boolean updateBook()
//
//
//    public int size() {
//        return size;
//    }
//
//}