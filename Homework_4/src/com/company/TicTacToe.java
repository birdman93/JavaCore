package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TicTacToe {

    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;

    public static final char DOT_EMPTY = '▪';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    public static char[][] map = new char[SIZE][SIZE];
    ;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static final String EMPTY_COLUMN_FIRST = "  ";
    public static final String EMPTY = " ";

    public static void main(String[] args) {

        initMap(); // Создаем игровое поле
        printMap(); // Выводим игровое поле
        game(); // сама игра
    }

    private static void game() {
        while (true) {
            humanTurn(); // ход игрока
            printMap();
            if (checkEnd(DOT_X, "\nВы победили!")) {
                System.exit(0);
            }

            aiTurn(); // ход компьютера
            printMap();
            if (checkEnd(DOT_0, "\nКомпьютер победил!")) {
                System.exit(0);
            }
        }
    }

    private static boolean checkEnd(char symbol, String winMessage) {

        if (checkWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }
        if (isMapFull()) {
            System.out.println("\nНичья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    // Проверка на победу
    private static boolean checkWin(char symbol) {
        for (int col = 0; col < (SIZE - 1); col++) {
            for (int row = 0; row < (SIZE - 1); row++) {
                if (checkDiagonals(symbol) || checkLines(symbol)) return true;
            }
        }
        return false;
    }

    private static boolean checkLines(char symbol) {
        boolean cols, rows;
        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < SIZE; row++) {
                cols &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);
            }
            if (cols || rows) return true;
        }
        return false;
    }

    private static boolean checkDiagonals (char symbol) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < SIZE; i++) {
            toright &= (map[i][i] == symbol);
            toleft &= (map[SIZE - i - 1][i] == symbol);
        }
        if (toright || toleft) return true;
        return false;
    }


    private static void aiTurn() {
        int rowNumber, colNumber;

        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = DOT_0;
        System.out.println("Компьютер сделал свой ход.");
    }


    private static void humanTurn() {
        int rowNumber, colNumber;

        do {
            System.out.println("Ваш ход. Введите номер строки и столбца.");
            System.out.print("Строка: ");
            rowNumber = scanner.nextInt();

            System.out.print("Столбец: ");
            colNumber = scanner.nextInt();

        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static boolean isCellValid (int rowNumber, int colNumber) {
        if(rowNumber < 1 || rowNumber > SIZE || colNumber < 1 || colNumber > SIZE) {
            System.out.println("Ошибка! Проверьте введенные значения.");
            return false;
        }
        if (map[rowNumber - 1][colNumber - 1] !=DOT_EMPTY){
            System.out.println("Выбранная ячейка занята.");
            return false;
        }
        return true;
    }

    private static void printMap() {
        printMapHeader();
        printMapRows();
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            int lineNumber = i + 1;
            System.out.print(lineNumber + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void printMapHeader() {
        System.out.print(EMPTY_COLUMN_FIRST);

        for (int i = 0; i < SIZE; i++) {
            int columnNumber = i + 1;
            System.out.print(columnNumber + EMPTY);
        }
        System.out.println();
    }

    private static void initMap() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                map [row][col] = DOT_EMPTY;
            }
        }
    }
}
