import java.sql.SQLOutput;
import java.util.Arrays;

public class Task_2 {

    /*Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21 */

    public static void main(String[] args) {

        int[] array_8 = new int[8];

        int j = 0;
        for (int i = 0; i < array_8.length; i++, j = j + 3) {
            array_8[i] = j;
            }
        System.out.println(Arrays.toString(array_8));
    }
}