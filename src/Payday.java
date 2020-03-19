public class Payday {
    public static void main(String[] args) {
        double money = 70000;
        double tax = (money/100) * 13;
        double salary = money - tax;
        System.out.println("Salary is " + salary);
    }
}
