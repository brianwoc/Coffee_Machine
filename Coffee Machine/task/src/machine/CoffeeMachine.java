package machine;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        if (water >= 200 * cups && milk >= 50 * cups && coffeBeans >= 15 * cups) {
            if (water >= 200 * (cups + 1) && milk >= 50 * (cups + 1) && coffeBeans >= 15 * (cups + 1) ){

                int one = water / 200;
                int two = milk / 50;
                int three = coffeBeans / 15;
                List<Integer> list = new LinkedList<Integer>();
                list.add(one);
                list.add(two);
                list.add(three);
                int cupsTotal = Collections.min(list);
                System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", cupsTotal -cups);
            }else {
                System.out.printf("Yes, I can make that amount of coffee");
            }
        }else {

            int one = water / 200;
            int two = milk / 50;
            int three = coffeBeans / 15;
            List<Integer> list = new LinkedList<Integer>();
            list.add(one);
            list.add(two);
            list.add(three);
            cups = Collections.min(list);
            System.out.printf("No, I can make only %d cup(s) of coffee", cups);

        }



    }
}
