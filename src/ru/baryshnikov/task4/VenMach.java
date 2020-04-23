package ru.baryshnikov.task4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VenMach {
    private ArrayList<Drinks> drinks = new ArrayList<>();

    private int money = 0;
    private int totalMoney = 0;
    private int i = 0;
    private String choose;
    private int counter = 1;
    private int chooseDrink;
    private boolean exc = true;
    private int ch;

    VenMach() {
        drinks.add(new Drinks("Coke", 20));
        drinks.add(new Drinks("Pepsi", 15));
        drinks.add(new Drinks("7 UP", 30));
        drinks.add(new Drinks("Mntn Dew", 50));
        drinks.add(new Drinks("Root Beer", 33));
        drinks.add(new Drinks("ION Energy Drink", 77));

        System.out.println("");
        System.out.println("Vending Machine have been launched");
        System.out.println("");
    }

    public void use() {
        do {
            System.out.println("");
            System.out.println("1. Show the list of all drinks");
            System.out.println("2. Money deposit");
            System.out.println("3. Choose and Buy a drink");
            System.out.println("4. Exit");
            Scanner scan = new Scanner(System.in);
            choose = scan.next();
            switch (choose) {
                case "1":
                    System.out.println("Here is a list of all drinks we have: ");
                    showAllDrinks();
                    break;
                case "2":
                    System.out.println("How much amount of money you want to deposit?");
                    addMoney(money = scan.nextInt());
                    break;
                case "3":
                    System.out.println("Choose a drink: ");
                    if (totalMoney < 15) {
                        System.out.println("Warning! You have " + totalMoney + "₽ in your wallet, you should at least have 15 roubles total.");
                        break;
                    }
                    showAllDrinks();
                    buyDrink();
                    break;
                case "4":
                    System.out.println("Thank you for using our vending machine!");
                    counter = 0;
                    break;
                default:
                    System.out.println("Error! You've chosen wrong number or pressed wrong button. Please, press right button: ");
                    break;
            }
        } while (counter != 0);
    }

    public void buyDrink() {
        int indexNum = drinks.size();
        System.out.println(indexNum -= 1);
        Scanner scan = new Scanner(System.in);
        exc = true;
        do {
            try {
                ch = scan.nextInt();
                if ((ch < 0) || (ch > indexNum)) throw new ArrayIndexOutOfBoundsException();
                exc = false;
            } catch (InputMismatchException ime) {
                System.out.println("You've entered wrong symbol");
                showAllDrinks();
                scan.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds");
                showAllDrinks();
            }
        } while (exc);

        if (totalMoney >= drinks.get(ch).getPrice()) {
            totalMoney -= drinks.get(ch).getPrice();
            System.out.println("You've bought " + drinks.get(ch).getName());
            System.out.println("Your amount of money is: " + totalMoney + "₽");
        } else {
            System.out.println("You don't have enough money to get this drink");
            System.out.println("This drink costs " + drinks.get(ch).getPrice() + "₽. You have: " + totalMoney + "₽");
        }
    }

    public void addMoney(int money) {
        this.money = money;
        totalMoney += this.money;
        System.out.println("You've put in " + this.money + "₽. " + "The total amount is: " + totalMoney);
    }

    public void showAllDrinks() {
        for (Drinks f:drinks) {
            System.out.println(i + ". " + f.getName() + ": " + f.getPrice() + "₽");
            i++;
        }
        i = 0;
    }
}
