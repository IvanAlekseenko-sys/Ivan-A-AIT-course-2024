package homework_44.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAppl {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Author1", "Book1", 2010, "Fiction", "USA", 500));
        bookList.add(new Book("Author2", "Book2", 2015, "Science", "UK", 750));
        bookList.add(new Book("Author3", "Book3", 2020, "Fantasy", "Germany", 1200));
        bookList.add(new Book("Author4", "Book4", 2018, "Fiction", "France", 600));
        bookList.add(new Book("Author5", "Book5", 2012, "Non-Fiction", "Spain", 850));
        bookList.add(new Book("Author6", "Book6", 2017, "Science", "Italy", 2000));

        // отобразить все книги
        System.out.println("-------------Books list------------");
        bookList.forEach(System.out::println);

        // отобразить книги указанного жанра
        System.out.println("------Print Fiction books only-------");
        bookList.stream()
                .filter(book -> book.getGenre().equals("Fiction"))
                .forEach(System.out::println);

        // отобразить книги дороже указанной цены
        System.out.println("-------------Books that cost more than 800: ------------");
        bookList.stream()
                .filter(book -> book.getPrice() > 800.0)
                .forEach(System.out::println);

        // отобразить книги, год выпуска которых находится в заданном диапазоне
        System.out.println("-------------Books published between 2016 and 2020 ------------");
        bookList.stream()
                .filter(book -> book.getYearOfPublication() >= 2016 && book.getYearOfPublication() <= 2020)
                .forEach(System.out::println);

        // отсортировать книги по цене от дорогих к дешевым
        System.out.println("-------------Books sorted by price from expensive to cheap ones ------------");
        bookList.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice).reversed())
                .forEach(System.out::println);

        // получить среднюю цену книг
        double averagePrice = bookList.stream()
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0.0);  // Если список пуст, возвращает 0.0

        System.out.println("---------------------------------");
        System.out.println("Average price of all books: " + averagePrice);

        // сколько и какие книги под каким издательством
        System.out.println("---------------Books grouped by publisher country----------------------");
        Map<String, List<Book>> booksByCountry = bookList.stream()
                .collect(Collectors.groupingBy(Book::getPublisherCountry));

        booksByCountry.forEach((country, books) -> {
            System.out.println("Publisher Country: " + country);
            System.out.println("Books quantity: " + books.size());
            books.forEach(System.out::println);
        });
    }
}
