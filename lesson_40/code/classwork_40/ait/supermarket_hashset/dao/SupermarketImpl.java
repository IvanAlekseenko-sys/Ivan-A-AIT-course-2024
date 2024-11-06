package classwork_40.ait.supermarket_hashset.dao;

import classwork_40.ait.supermarket_hashset.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket {

    private Collection<Product> products = new HashSet<>();

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    @Override
    public boolean addProduct(Product product) {
        if(product == null){
            return false;

        }
        return products.add(product);
    }

    @Override
    public Product remove(long barCode) {
        Product product = findByBarcode(barCode);
        products.remove(product);
        return product;
    }

    @Override
    public Product findByBarcode(long barCode) {
        for (Product p : products) {
            if(p.getBarcode() == barCode){
                return p;
            };

        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {

        return findByPredicate(product -> product.getCategory().equalsIgnoreCase(category)) ;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
    }

    @Override
    public Iterable<Product> findByProductsWithExpiredDate() {

        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }
    //отбор списков по критериям
    private Iterable<Product> findByPredicate (Predicate<Product> predicate){
        Set<Product> res = new HashSet<>();
        for (Product p : products) {
            if(predicate.test(p)){
                res.add(p);

            }

        }
        return res;
    }
}
