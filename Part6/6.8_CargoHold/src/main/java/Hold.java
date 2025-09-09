import java.util.ArrayList;

public class Hold {

    private int maxW;
    private ArrayList<Suitcase> cargoHold = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxW = maxWeight;
    }


    public void addSuitcase(Suitcase suitcase) {

        int totalW = 0;
        for (Suitcase s: cargoHold) {
            totalW += s.totalWeight();
        }

        if (totalW + suitcase.totalWeight() <= maxW) {
            this.cargoHold.add(suitcase);
        }
    }

    public String toString() {

        int totalW = 0;
        int count = 0;
        for (Suitcase s: this.cargoHold) {
            totalW += s.totalWeight();
            count++;
        }

        return count + " suitcases " + "(" + totalW + " kg)";
    }

    public void printItems() {
        for (Suitcase s: this.cargoHold) {
            s.printItems();
        }
    }
}
