package machine;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class CoffeeMachine {
    public static void main(String[] args) {
//ll
        Scanner scanner = new Scanner(in);

        int water = 400;
        int milk = 540;
        int coffeBeans = 120;
        int disposalCups = 9;
        int cash = 550;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();

        while (!action.equals("exit")) {

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buyProduct = scanner.nextLine();
                    switch (buyProduct) {
                        case "1":
                            if (water >= 250 && coffeBeans >= 16 && disposalCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                coffeBeans -= 16;
                                disposalCups--;
                                cash += 4;
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;

                            } else if (coffeBeans < 16) {
                                System.out.println("Sorry, not enough coffe beans!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (disposalCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            }


                        case "2":
                            if (water >= 350 && coffeBeans >= 20 && disposalCups >= 1 && milk >= 75) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffeBeans -= 20;
                                disposalCups--;
                                cash += 7;
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (coffeBeans < 20) {
                                System.out.println("Sorry, not enough coffe beans!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;

                            } else if (disposalCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            }


                        case "3":
                            if (water >= 200 && coffeBeans >= 12 && disposalCups >= 1 && milk >= 100){
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffeBeans -= 12;
                                disposalCups--;
                                cash += 6;
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            }else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                System.out.println("Write action (buybu, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            } else if (coffeBeans < 12) {
                                System.out.println("Sorry, not enough coffe beans!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;

                            } else if (disposalCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println("Write action (buy, fill, take, remaining, exit):");
                                action = scanner.nextLine();
                                break;
                            }

                        case "back":
                            System.out.println("Write action (buy, fill, take, remaining, exit):");
                            action = scanner.nextLine();
                            break;


                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water = scanner.nextInt() + water;
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk = scanner.nextInt() + milk;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffeBeans = scanner.nextInt() + coffeBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    disposalCups = scanner.nextInt() + disposalCups;
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = scanner.next();
                    break;
                case "take":
                    System.out.println("I gave you $" + cash);
                    cash = 0;
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = scanner.next();
                    break;
                case "remaining":
                    getInfo(water, milk, coffeBeans, disposalCups, cash);
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = scanner.next();
                    break;


            }


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