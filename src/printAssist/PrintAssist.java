package printAssist;

import java.util.List;

import models.Product;

public class PrintAssist {
    public static void printIntArray(int[] intArray) {
        StringBuilder lineBuilder = new StringBuilder();
        for (int num : intArray) {
            lineBuilder.append(num);
            if (num != intArray[intArray.length-1]) {
                lineBuilder.append(" , ");
            }
        }
        System.out.println(lineBuilder.toString());
    }

    public static void printProductList(List<Product> products) {
        StringBuilder lineBuilder = new StringBuilder();
        for (Product product : products) {
            lineBuilder.append(product.getName());
            if (product != products.get(products.size()-1)) {
                lineBuilder.append(" , ");
            }
        }
        System.out.println(lineBuilder.toString());
    }
}
