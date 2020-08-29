package ru_java_lesson_3;


import java.util.Scanner;

public class hw3_practice {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            int unknownNumber, userNumber = 0;
            int trysCount = 3;
            Scanner input = new Scanner(System.in);

            System.out.println("Угадай число (от 0 до 9).");

            unknownNumber = (int) Math.floor(Math.random() * (10) - 1);

            do {
                trysCount--;

                System.out.print("Введите ваше число: ");

                userNumber = input.nextInt();

                if (userNumber < 0 || userNumber > 9) {
                    System.out.println("Вы ввели число не из-заданного диапазона");
                    System.out.println("Повторите ввод");
                    }
                    if (userNumber > unknownNumber) {
                        System.out.println("Загаданное число меньше.");

                    } else if (userNumber < unknownNumber) {
                        System.out.println("Загаданное число больше.");

                    } else {
                        System.out.println("Вы угадали!");
                    }


            }while (userNumber != unknownNumber);

            System.out.println("Количество попыток: " + trysCount);

            System.out.println("Повторить игру еще раз 1 - да / 2 - нет");
            Scanner answer = new Scanner(System.in);
            String s = answer.next();
            answer.nextLine();
            if (s.trim().toLowerCase().equals("1")) {
                playAgain = true;
            } else {
                playAgain = false;
                System.out.println("До свидания!");
            }
        }
    }
}


