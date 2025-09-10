
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {

            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;

            }

            String[] parts = input.split(" ");

            String command = parts[0];
            String value = parts[1];
            int x = Integer.valueOf(value);

            if (command.equals("add")) {

                if (firstContainer + x > 100) {
                    firstContainer = 100;

                } else {
                    if (x < 0) {
                        continue;
                    }
                    firstContainer += x;
                }

            } else if (command.equals("move")) {

                if (x > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }

                } else {
                    secondContainer += x;
                    firstContainer -= x;

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                }
            } else if (command.equals("remove")) {

                secondContainer -= x;

                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }


        }
    }
}
