import java.util.Arrays;

public class Task_4 {

    /* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами */

    public static void main(String[] args) {

        int[][] arrayTask4 = new int[5][5];
        for (int i = 0; i < arrayTask4.length; i++) {
            for (int j = 0; j < arrayTask4[i].length; j++) {
                if (i == j) {
                    arrayTask4[i][j] = 1;
                } else if (i != j) {
                    arrayTask4[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arrayTask4.length; i++) {
            for (int j = 0; j < arrayTask4[i].length; j++) {
                System.out.print(arrayTask4[i][j] + " ");
            }
            System.out.println();
        }
    }
}