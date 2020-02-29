import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.sql.SQLOutput;

public class Task_1 {

/*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;  */

    public static void main(String[] args) {

        int[] array_0_and_1 = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        System.out.println("Искходный массив: ");
        for (int i = 0; i < array_0_and_1.length; i++)
            System.out.print(array_0_and_1[i] + " ");
            System.out.println();

            for (int i = 0; i < array_0_and_1.length; i++) {
                if (array_0_and_1[i] == 0) {
                    array_0_and_1[i] = 1;
                } else {
                    array_0_and_1[i] = 0;
                }
            }
        System.out.println("Преобразованный массив:");
            for (int i = 0; i < array_0_and_1.length; i++)
                System.out.print(array_0_and_1[i] + " ");
    }
}