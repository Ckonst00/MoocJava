
public class HealthStation {
    private int numberOfWeighings;

    public HealthStation() {
        this.numberOfWeighings = 0;
    }
    public int weigh(Person person) {
        this.numberOfWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.numberOfWeighings;
    }
}
