package ss12_collection_framework.baitap.luyentap.service;


import ss12_collection_framework.baitap.luyentap.model.Product;

import java.util.Comparator;

public class PriceComparatorReduction implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}