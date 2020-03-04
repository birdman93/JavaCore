package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TicTacToe {

    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 4;

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
        game(); // Процесс игры
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
    /* В квадрате 5х5 есть 4 квадрата 4х4, заполнив которые, можно победить,
       мы будем перебирать их стартовые позиции: 2 в первой строке и 2 во второй строке,
       но формула будет работать и при изменении констант*/
        for (int col = 0; col < (SIZE - DOT_TO_WIN + 1); col++) {
            for (int row = 0; row < (SIZE - DOT_TO_WIN + 1); row++) {
                if (checkDiagonals(symbol, col, row) || checkLines(symbol, col, row)) return true;
            }
        }
        return false;
    }

    private static boolean checkLines(char symbol, int indentX, int indentY) { // инты добавлены для учета сдвига потенциальных "победных" квадратов
        boolean cols, rows;
        for (int col = indentX; col < (indentX + DOT_TO_WIN); col++) {
            cols = true;
            rows = true;
            for (int row = indentY; row < (indentY + DOT_TO_WIN); row++) {
               // Проверяем по логике: 1 & 1 = 1; 1 & 0 = 0
                cols = cols & (map[col][row] == symbol);
                rows = rows & (map[row][col] == symbol);
            }
            if (cols || rows) return true;
        }
        return false;
    }

    private static boolean checkDiagonals (char symbol, int indentX, int indentY) {
        boolean toRight, toLeft;
        toRight = true;
        toLeft = true;
        for (int i = 0; i < DOT_TO_WIN; i++) {
            toRight = toRight & (map[i + indentX][i + indentY] == symbol);
            toLeft = toLeft & (map[DOT_TO_WIN - i - 1 + indentX][i + indentY] == symbol);
        }
        if (toRight || toLeft) return true;
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
