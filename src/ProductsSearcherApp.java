import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import models.Product;
import models.ProductsDAO;
import printAssist.PrintAssist;

public class ProductsSearcherApp {
    public static void main(String[] args) {
        List<Product> products = new ProductsDAO().getProducts();

        PrintAssist.printProductList(products);

        // カスタム比較器（ラムダ式）によるソート：下3つは同義
        // Collections.sort(products, new Product.PriceComparator());
        Collections.sort(products, (p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()));
        // products.sort(Comparator.comparingInt(Product::getPrice));
        PrintAssist.printProductList(products);

        products.sort(Comparator.comparingInt(Product::getPrice).thenComparing(Product::getName));
        PrintAssist.printProductList(products);
    }
}
