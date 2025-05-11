package models;

import java.util.Comparator;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public static class PriceComparator implements Comparator<Product> {
        // 冗長、未使用
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.getPrice(), p2.getPrice());
        }
    }
}
