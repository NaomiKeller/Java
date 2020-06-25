
import java.util.Arrays;
import java.util.Comparator;

/**
 * BubbleSort
 * Naomi Keller
 * 11/12/2019
 * Writing two generic methods using bubble sort
 * */
public class Ex1 {
    public static void main(String[] args) {
        Integer[] list = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2};
        System.out.println(Arrays.toString(list));

        bubbleSort(list);
        System.out.println(Arrays.toString(list));

        bubbleSort(list, Comparator.reverseOrder());
        System.out.println(Arrays.toString(list));
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        bubbleSort(list, Comparator.naturalOrder());
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], (list[i + 1])) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}