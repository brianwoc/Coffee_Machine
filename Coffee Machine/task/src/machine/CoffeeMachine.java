package machine;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int water = 1200;
        int milk = 540;
        int coffeBeans = 120;
        int disposalCups = 9;
        int cash = 550;
        getInfo(water, milk, coffeBeans, disposalCups, cash);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String buyProduct = scanner.nextLine();
                switch (buyProduct) {
                    case "1":
                        water -= 250;
                        coffeBeans -= 16;
                        disposalCups--;
                        cash += 4;
                        getInfo(water, milk, coffeBeans, disposalCups, cash);
                        break;
                    case "2":
                        water -= 350;
                        milk -= 75;
                        coffeBeans -= 20;
                        disposalCups--;
                        cash += 7;
                        getInfo(water, milk, coffeBeans, disposalCups, cash);
                        break;
                    case "3":
                        water -= 200;
                        milk -= 100;
                        coffeBeans -= 12;
                        disposalCups--;
                        cash += 6;
                        getInfo(water, milk, coffeBeans, disposalCups, cash);
                        break;

                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                water = scanner.nextInt()+water;
                System.out.println("Write how many ml of milk do you want to add:");
                milk = scanner.nextInt()+milk;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                coffeBeans = scanner.nextInt()+coffeBeans;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                disposalCups = scanner.nextInt()+disposalCups;
                getInfo(water, milk, coffeBeans, disposalCups, cash);
                break;
            case "take":
                System.out.println("I gave you $"+cash);
                cash=0;
                getInfo(water,milk,coffeBeans,disposalCups,cash);
                break;



        }



    }

    public static void getInfo(int water, int milk, int coffeBeans, int disposalCups, int cash) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water\n", water);
        System.out.printf("%d of milk\n", milk);
        System.out.printf("%d of coffee beans\n", coffeBeans);
        System.out.printf("%d of disposable cups\n", disposalCups);
        System.out.printf("%d of money\n", cash);
    }
}

