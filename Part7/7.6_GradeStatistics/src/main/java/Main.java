
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers nums = new Numbers();


        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            nums.addNew(input);
        }

        System.out.println("Point average (all): " + nums.calculateAvg());
        double points = nums.avgPass();
        String str = (points == 0) ? "-" : String.valueOf(points);
        System.out.println("Point average (passing): " + str);
        System.out.println("Pass percentage: " + nums.passPercentage());
        nums.printdaf();
    }
}
