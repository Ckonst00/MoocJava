
import java.util.Scanner;

public class LiquidContainers {


    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(value);
            } else if (command.equals("remove")) {
                container2.remove(value);
            } else if (command.equals("move")) {
                if (container1.contains() >= value) {
                    container1.remove(value);
                    container2.add(value);
                } else if (value > container1.contains()) {

                    container2.add(container1.contains());
                    container1.remove(container1.contains());

                }

            }
        }
    }
}
