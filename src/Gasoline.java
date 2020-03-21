import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner litreScan = new Scanner(System.in);
        Scanner costScan = new Scanner(System.in);

        double litre = litreScan.nextDouble();
        double cost = costScan.nextDouble();
        double sum = litre * cost;

        System.out.println("The cost is: " + sum + "₽");
    }
}
