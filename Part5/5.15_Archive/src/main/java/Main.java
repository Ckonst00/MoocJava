
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String itemId = scanner.nextLine();
            if (itemId.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String itemName = scanner.nextLine();
            if (itemName.equals("")) {
                break;
            }

            Item newItem = new Item(itemName, itemId);

            if (items.contains(newItem)) {
                continue;
            } else {
                items.add(newItem);
            }
        }

        System.out.println("==Items==");
        for (Item item:items) {
            System.out.println(item);
        }

    }
}
