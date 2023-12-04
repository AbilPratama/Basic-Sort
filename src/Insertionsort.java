import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 12, 8};
        var sortedArray = Insertionsort.sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            var j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(array, j, j - 1);
                j--;
            }
        }
        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
