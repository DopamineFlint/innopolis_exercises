import java.util.Scanner;

public class Payday {
    public static void main(String[] args) {
        Scanner moneyScan = new Scanner(System.in);
        double money = moneyScan.nextDouble();
        double tax = (money/100) * 13;
        double salary = money - tax;
        System.out.println("Salary is " + salary);
    }
}
