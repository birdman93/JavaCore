public class Task_7 {

/*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами */


    public static void main(String[] args) {

        int[] arrayTask7 = {1, 2, 3, 4, 5};
        int n = 0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int last = arrayTask7[arrayTask7.length - 1];
                for (int j = arrayTask7.length - 1; j > 0; j--) {
                    arrayTask7[j] = arrayTask7[j - 1];
                }
                arrayTask7[0] = last;
            }
            for (int k = 0; k < arrayTask7.length; k++)
                System.out.println(arrayTask7[k]);

        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int first = arrayTask7[0];
                for (int j = 0; j < arrayTask7.length - 1; j++){
                    arrayTask7[j] = arrayTask7[j+1];
                }
                arrayTask7[arrayTask7.length - 1] = first;
            }
            for (int k = 0; k < arrayTask7.length; k++)
                System.out.println(arrayTask7[k]);
        }
    }
}