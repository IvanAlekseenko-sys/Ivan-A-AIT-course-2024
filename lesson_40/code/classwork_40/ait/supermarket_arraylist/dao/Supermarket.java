package classwork_40.ait.supermarket_arraylist.dao;

import classwork_40.ait.supermarket_arraylist.model.Product;

public interface Supermarket extends Iterable<Product> {
    boolean addProduct(Product product);
    Product remove (long barCode);
    Product findByBarcode(long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findByProductsWithExpiredDate();
    int skuQuantity();

}
