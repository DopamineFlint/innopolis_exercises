package ru.baryshnikov.task20;

import java.util.*;

class Cashbox implements Basket {
    Map<String, Integer> map = new HashMap<String, Integer>();

    public void addProduct(String product, int quantity) {
        this.map.put(product, quantity);
    }

    public void removeProduct(String product) {

        for (Iterator<String> it = map.keySet().iterator(); it.hasNext();) {
            if (product == it.next()) {
                map.remove(product);
            }
        }
    }

    public void updateProductQuantity(String product, int quantity) {

        for (Iterator<String> it = map.keySet().iterator(); it.hasNext();) {
            if (product == it.next()) {
                map.put(product, quantity);
            }
        }
    }

    public void clear() {
        map.clear();
    }

    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        list.addAll(map.keySet());
        return list;
    }

    public int getProductQuantity(String product) {
        return map.get(product);
    }
}
