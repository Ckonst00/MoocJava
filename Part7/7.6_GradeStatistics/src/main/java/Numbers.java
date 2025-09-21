import java.util.ArrayList;

public class Numbers {

    private ArrayList<Integer> numbers;

    public Numbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNew(int number) {
        if (number > 0 && number <= 100) {

            this.numbers.add(number);
        }
    }

    public double calculateAvg() {

        double avg = 0;
        int size = this.numbers.size();

        for (Integer num : this.numbers) {
            avg += num;
        }
        return avg/size;
    }

    public double avgPass() {

        double avg = 0;
        int size = 0;

        for (Integer num : this.numbers) {
            if (num >= 50) {
                avg += num;
                size++;
            }
        }

        if (size == 0) {
            return 0;
        }
        return avg/size;
    }

    public double passPercentage() {

        int count = 0;
        int size = this.numbers.size();

        if (size == 0) return 0;

        for (Integer num : this.numbers) {
            if (num >= 50) {
                count++;
            }
        }

        return 100.0 * count / size;
    }

    public void printdaf() {

        int[] grades = new int[6];

        for (Integer num : this.numbers) {
            if (num < 50) grades[0]++;
            else if (num < 60) grades[1]++;
            else if (num < 70) grades[2]++;
            else if (num < 80) grades[3]++;
            else if (num < 90) grades[4]++;
            else grades[5]++;

        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
