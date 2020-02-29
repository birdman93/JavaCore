package com.company;
/* При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы */

import java.util.Scanner;

public class Task_Strings {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        /*      System.out.println(words.length); можно посчитать длину массива – 25 элементов */

        int random = (int) (Math.random() * 25); // генерируем рандомное число от 0 до 24
        String randomWord = words[random]; // на основе рандомного числа загадываем слово в массиве

        System.out.println("Сыграем в игру. Угадай, что за слово из списка я загадал: \n");
        for (int i = 0; i < 25; i++)
            System.out.println(words[i]);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nВведите слово. Для выхода из игры нажмите Enter");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals("")) break;
            else if (userAnswer.equals(randomWord)) {
                System.out.println("Вы угадали!");
                break;
            }
            char[] charAnswer = userAnswer.toCharArray();
            for(int i = 0; i < randomWord.length(); i++) {
                if (i >= charAnswer.length) break;
                if (randomWord.charAt(i) != charAnswer[i]) charAnswer [i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }
}