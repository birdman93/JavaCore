package com.company;

/* Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет) */

import java.util.Scanner;

public class Task_Numbers {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10); // задаем рандомое число от 0 до 9
        Scanner scanner = new Scanner(System.in);

        int tryNumber = 1; // будем писать пользователю номер попытки
        System.out.println("Угадайте число от 0 до 9 с трех попыток. Попытка №" + tryNumber + ".");

        for (int i = 0; i < 3; i++) {

            int userNumber = scanner.nextInt();

            tryNumber++;
            if (tryNumber == 4 && randomNumber != userNumber) {
                System.out.println("Вы не угадали. Ответ: " + randomNumber);
                break;
            } else if (randomNumber < userNumber)
                System.out.println("Вы ввели слишком большое число. Попробуйте еще. Попытка №" + tryNumber + ".");
            else if (randomNumber > userNumber)
                System.out.println("Вы ввели слишком маленькое число. Попробуйте еще. Попытка №" + tryNumber + ".");
            else if (randomNumber == userNumber) {
                System.out.println("Вы угадали!");
                break;
            }
        }
        scanner.close();
    }
}
