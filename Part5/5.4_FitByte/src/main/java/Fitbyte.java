public class Fitbyte {

    private int age;
    private int restHeartRate;

    public Fitbyte(int age , int restingHeartRate) {
        this.age = age;
        this.restHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHR = 206.3 - (0.711 * this.age);
        double target = (maxHR - this.restHeartRate) * percentageOfMaximum + this.restHeartRate;
        return target;
    }
}
