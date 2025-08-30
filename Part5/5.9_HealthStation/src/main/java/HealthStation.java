
public class HealthStation {


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

}
