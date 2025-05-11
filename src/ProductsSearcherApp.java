import java.util.Collections;
import java.util.List;

import models.Product;
import models.ProductsDAO;
import printAssist.PrintAssist;

public class ProductsSearcherApp {
    public static void main(String[] args) {
        List<Product> products = new ProductsDAO().getProducts();

        PrintAssist.printProductList(products);

        // カスタム比較器（ラムダ式）によるソート：下二つは同義
        // Collections.sort(products, new Product.PriceComparator());
        Collections.sort(products, (p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()));
        PrintAssist.printProductList(products);
    }
}
