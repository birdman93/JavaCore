import java.util.Arrays;

public class Task_3 {

/* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 */

    public static void main(String[] args) {

        int [] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < 6){
                arrayTask3[i] = arrayTask3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayTask3));
    }
}
