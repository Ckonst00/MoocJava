import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> store;

    public Package() {
        this.store = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.store.add(gift);
    }

    public int totalWeight() {
        if (store.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (Gift gift : store) {
            sum += gift.getWeight();

        }
        return sum;
    }
}
