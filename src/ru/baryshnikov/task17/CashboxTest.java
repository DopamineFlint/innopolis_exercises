package ru.baryshnikov.task17;

public class CashboxTest {
    public static void main(String[] args) {
        Cashbox cash = new Cashbox();

        cash.addProduct("Apple", 100);
        cash.addProduct("Cheese", 120);
        cash.addProduct("Cake", 40);
        System.out.println(cash.getProducts());

        System.out.println(cash.getProductQuantity("Cake"));
        System.out.println(cash.getProductQuantity("Apple"));
        System.out.println(cash.getProductQuantity("Cheese"));

        cash.updateProductQuantity("Apple", 50);
        System.out.println(cash.getProductQuantity("Apple")); //50

        cash.removeProduct("Cheese");
        System.out.println(cash.getProducts());

        cash.clear();
        System.out.println(cash.getProducts());

    }
}
