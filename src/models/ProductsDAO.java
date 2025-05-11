package models;

import java.util.ArrayList;
import java.util.List;

public class ProductsDAO {
    private List<Product> products = new ArrayList<Product>();

    public ProductsDAO() {
        products.add(new Product("Pen", 100));
        products.add(new Product("Note", 120));
        products.add(new Product("Paper", 250));
        products.add(new Product("Sticker Paper", 800));
        products.add(new Product("Eraser", 80));
    }

    public List<Product> getProducts() {
        return products;
    }
}
