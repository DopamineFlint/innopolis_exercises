package ru.baryshnikov.task1;

import java.util.Scanner;

public class HotAndCold {
    public static void main(String[] args) {

            boolean exit = false;

            Scanner scanExit = new Scanner(System.in);

            System.out.print("First of all, do you really want to play this game or maybe you wanna quit? 1 - quit, 0 - play: ");
            int inpExit = scanExit.nextInt();
            while (inpExit < 0 || inpExit > 1) {
                System.out.println("You must input 1 - yes or 0 - no: ");
                inpExit = scanExit.nextInt();
            }

            if (inpExit == 1) {
                exit = true;
            }

            while (!exit) {

                int numSave = 0;

                System.out.println("I'm making a random number...now go guess it: ");
                int number = (int) (Math.random() * 100);
                System.out.println(number);

                Scanner scanNum = new Scanner(System.in);
                System.out.print("Input number: ");
                int inpNum = scanNum.nextInt();
                System.out.println(inpNum);

                while (inpNum != number) {
                    while (inpNum < 0 || inpNum > 100) {
                        System.out.println("You can't input number less than 0 or more than 100");
                        System.out.print("Input number: ");
                        inpNum = scanNum.nextInt();
                    }
                    if (inpNum < number) {
                        System.out.println("less than");
                        if (numSave == 0) {
                            System.out.println("Hot");
                            numSave = inpNum;
                        }

                        if (inpNum < numSave) {
                            System.out.println("cold");
                            numSave = inpNum;
                        }

                        if (inpNum > numSave) {
                            System.out.println("hot");
                            numSave = inpNum;
                        }
                        inpNum = scanNum.nextInt();
                    }

                    if (inpNum > number) {
                        System.out.println("More than");
                        if (numSave == 0) {
                            System.out.println("Hot");
                            numSave = inpNum;
                        }

                        if (inpNum < numSave) {
                            System.out.println("Hot");
                            numSave = inpNum;
                        }

                        if (inpNum > numSave) {
                            System.out.println("cold");
                            numSave = inpNum;
                        }

                        inpNum = scanNum.nextInt();
                    }
                }
                System.out.println("Congrats! You've found a number!");
                System.out.print("Do you want to exit or play again? 1 - yes, 0 - no: ");
                inpExit = scanExit.nextInt();

                while (inpExit < 0 || inpExit > 1) {
                    System.out.println("You must input 1 - yes or 0 - no: ");
                    inpExit = scanExit.nextInt();
                }

                if (inpExit == 1) {
                    exit = true;
                }
            }
    }
}
