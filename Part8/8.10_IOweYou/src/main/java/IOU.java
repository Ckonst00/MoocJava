import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debts;

    public IOU() {
        this.debts = new HashMap<String, Double>();
    };

    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        double debtAmount = 0;

        for (String person : this.debts.keySet()) {

            if(person.equals(toWhom)) {
                debtAmount += this.debts.get(person);
            }
        }

        return debtAmount;
    }
}
