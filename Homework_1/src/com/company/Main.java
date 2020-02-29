package com.company;
/*  Задание 1. Создать пустой проект в IntelliJ IDEA и прописать метод main() */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    }

/*  Задание 2. Создать переменные всех пройденных типов данных, и инициализировать их значения */
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2147483647;
    long myLong = 999999999999999999L;
    float myFloat = 26.12f;
    double myDouble = 26.121993;
    char myChar = 'D';
    boolean myBoolean = true;

/*  Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода*/
    public static class Computation {
        public static void main(String[] args) {
            double a, b, c, d, result;
            a = 2.5;
            b = 1.7;
            c = 7.33;
            d = 9.01;
            result = a * (b + (c / d));
            System.out.print(result);
        }
    }

/*  Задание 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
        если да – вернуть true, в противном случае – false */
    public static class From10to20 {
        public static void main(String[] args) {
            int a = 5;
            int b = 17;
            if (10 <= (a + b) && (a + b) <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

/*  Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.  */
    public static class PositiveOrNegative {
        public static void main (String[] args) {
            int a = 5;
                if (a >= 0) {
                    System.out.println("Положительное");
                } else {
                    System.out.println("Отрицательное");
                }
        }
    }

/*  Задание 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное*/
    public static class NegativeNumber {
        public static boolean main (int a) {
            if (a < 0) {
                return true;
            } else {
                return false;
            }
        }
    }

/* Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вывести в консоль сообщение «Привет, указанное_имя!» */
    public static class Hello {
        public static void main(String[] args) {
            String name = "World";
            System.out.println("Hello, " + name);
        }
    }

/* Задание 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */
    public static class Year {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите год");
            int yearNumber = scan.nextInt();
            if(((yearNumber % 4) == 0) && (yearNumber % 100) != 0) {
                System.out.println("Вы указали високосный год");
            } else if ((yearNumber % 400) == 0) {
                System.out.println("Вы указали високосный год");
            } else {
                System.out.println("Вы указали НЕ високосный год");
            }
        }
    }

}