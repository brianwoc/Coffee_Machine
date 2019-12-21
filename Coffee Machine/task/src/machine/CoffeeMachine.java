package machine;

import java.util.Scanner;

import static java.lang.System.in;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        System.out.println("Write how many cups of coffee you will need: ");

        String input = scanner.nextLine();
        int cups = Integer.parseInt(input);
        int water = cups*200;
        int milk = cups* 50;
        int coffeBeans= cups*15;
        System.out.printf("For %s cups of coffee you will need:\n",input);
        System.out.printf("%d ml of water\n",water);
        System.out.printf("%d ml of milk\n",milk);
        System.out.printf("%d g of coffee beans\n",coffeBeans);

    }
}
