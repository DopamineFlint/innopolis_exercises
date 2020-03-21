import java.util.Scanner;

public class HotAndCold {
    public static void main(String[] args) {
        System.out.println("Making a random number...now guess it: ");
        int number = (int) (Math.random() * 100);
        System.out.println(number);

        Scanner scanNum = new Scanner(System.in);
        System.out.print("Input number: ");
        int inpNum = scanNum.nextInt();
        System.out.println(inpNum);

        //this class is under construction. WIP
    }
}
