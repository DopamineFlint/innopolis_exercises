package ru.baryshnikov.task5;

public class ConvTest {
    public static void main(String[] args) {
        Contract cont = new Contract(10, 5, "Coke");
        cont.addToList("Pepsi");
        System.out.println(cont.getProdList());

        System.out.println(cont);
        Converter.conv(cont);
    }
}
