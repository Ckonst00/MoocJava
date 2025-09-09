import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) {
        this.maxWeight = maximumWeight;
    }

    public void addItem(Item item) {
        int total = 0;
        for (Item i : this.items) {
            total += i.getWeight();
        }
        if (total + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        int total = 0;
        int count = 0;
        for (Item i : this.items) {
            total += i.getWeight();
            count++;
        }

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (count == 1) {
         return count + " item (" + total + " kg)";
        }

        return count + " items (" + total + " kg)";
    }

    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i.toString());
        }
    }

    public int totalWeight() {
        int totalW = 0;
        for (Item i : this.items) {
            totalW += i.getWeight();
        }
        return totalW;
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item i : this.items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
}
