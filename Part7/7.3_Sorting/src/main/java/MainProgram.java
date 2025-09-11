
import java.util.Arrays;

public class MainProgram {


    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {

        int num = smallest(array);
        int index = 0;

        for (int i = 0; i < array.length; i++ ) {

           if (array[i] == num) {
               index = i;
           }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int minIndex = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int num1 = array[index1];
        int num2 = array[index2];

        array[index1] = num2;
        array[index2] = num1;
    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            int smallestIndex = indexOfSmallestFrom(array, i);

            swap(array, i, smallestIndex);

            System.out.println(Arrays.toString(array));
        }
    }
}
