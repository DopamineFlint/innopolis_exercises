package ru.baryshnikov.task17;

import java.util.*;

public class Cashbox implements Basket {
    String product;
    int quantity;
    List<Product> lili = new ArrayList<>();

    public void addProduct(String product, int quantity) {
        lili.add(new Product(this.product = product, this.quantity = quantity));
    }

    public void removeProduct(String product) {
        int i = 0;
        for (Product p: lili) {
            if (p.getName() == product) {
                lili.remove(i);
                System.out.println(p.getName() + " removed");
            }
            i++;
        }
    }

    public void updateProductQuantity(String product, int quantity) {
        int i = 0;
        for (Product p: lili) {
            if (p.getName() == product) {
                lili.set(i, (new Product(this.product = product, this.quantity = quantity))); //need to edit this shit
            }
            i++;
        }
    }

    public void clear() {
        lili.clear();
    }

    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        for (Product p: lili) {
            list.add(p.getName());
        }
        return list;
    }

    public int getProductQuantity(String product) {
        int i = 0;
        int count = 0;
        for (Product p: lili) {
            if (p.getName() == product) {
                count = p.getCount();
            }
            i++;
        }
        return count;
    }
}
