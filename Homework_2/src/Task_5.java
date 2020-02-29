public class Task_5 {

    /*  Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета) */

    public static void main(String[] args) {

        int[] array_Task5 = {10, 5, 1, 3, 9, 2, 8, 6, 7, 4};
        int min = array_Task5[0];
        int max = array_Task5[0];

        for (int i = 0; i < array_Task5.length; i++) {
            min = (min <= array_Task5[i]) ? min : array_Task5[i];
            max = (max >= array_Task5[i]) ? max : array_Task5[i];
        }
        System.out.println("Минимальное значение: " + min + "\n" + "Максимальное значение: " + max);
    }
}