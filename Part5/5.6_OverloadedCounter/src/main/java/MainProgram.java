public class MainProgram {

    public static void main(String[] args) {

        // Testing the Counter class

        Counter counter = new Counter(10);

        System.out.println("Start value: " + counter.value());

        counter.increase();
        System.out.println("Value after increasing: " + counter.value());

        counter.decrease();
        System.out.println("Value after decreasing: " + counter.value());

        Counter counter2 = new Counter();
        System.out.println("New counter object with value of zero: " + counter2.value());

        counter.increase(5);
        System.out.println("Increasing the value with 5: " + counter.value());

        counter.decrease(5);
        System.out.println("Decreasing the value with 5: " + counter.value());

        counter.increase(-1);
        System.out.println("Value should not change: " + counter.value());

        counter.decrease(-2);
        System.out.println("Value should not change: " + counter.value());
    }
}
