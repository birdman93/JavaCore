public class Task_6 {

/*  Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
граница показана символами ||, эти символы в массив не входят */

/* Я не реализовал это задание через метод, увы. Хотя алгоритм работает и не будет зависеть от размера массива,
а также не требуется, чтобы массив был симметричным. */

    public static void main(String[] args) {

        int[] arrayTask6 = {1, 2, 3, 4, 5, 5};

/* Идея решения: суммируем все элементы массива, а также ищем половину этой суммы для последующей проверки */

        int sum = 0;
        int middle = 0;

        for (int i = 0; i < arrayTask6.length; i++) {
            sum = sum + arrayTask6[i];
            if (middle < (sum / 2)) {
                middle = middle + arrayTask6[i];
            }
        }

/* Если среднее значение будет нечетным, то мы должны получить false */
        if (middle % 2 != 0)
            System.out.println(false);
/* Далее будем последовательно складывать элементы массива, если они сравняются с middle, вернем true */
        else {
            int task = 0;

            for (int i = 0; i < arrayTask6.length; i++) {
                if (task < middle) {
                    task = task + arrayTask6[i];
                } else {
                    break;
                }
                if ((middle - task) < 0)
                    System.out.println(false);
                else if ((middle - task) == 0)
                    System.out.println(true);
            }

        }
    }
}