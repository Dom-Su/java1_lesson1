package geekbrains.ru_java_lesson_2;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {


//1 Задание
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(" 1. Задать целочисленный массив, состоящий из элементов 0 и 1.\n" +
                "Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].\n" +
                "С помощью цикла и условия заменить 0 на 1, 1 на 0;");

        System.out.println("[1, 1, 0, 0, 1, 0, 1, 1, 0, 0]");

        for (int i = 0; i < firstArr.length; i++)
            if (firstArr[i] == 1) {
                firstArr[i] = 0;
            } else {
                firstArr[i] = 1;
            }
        System.out.println(Arrays.toString(firstArr));

//2 Задание
        System.out.println("\n2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его " +
                "значениями 0 3 6 9 12 15 18 21;");
        int[] secondArr = new int[8];
        int j = 0;
        for (int i = 0; i < secondArr.length; i++, j += 3) {
            secondArr[i] = j;
        }

        System.out.println("Решение " + Arrays.toString(secondArr));


//3 Задание
        System.out.println("\n3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] " +
                "пройти по нему циклом, и числа меньшие 6 умножить на 2");
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] < 6) {
                thirdArr[i] *= 2;
            }
        }
        System.out.println("Решение " + Arrays.toString(thirdArr));


//4 Задание
        System.out.println("\n4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)," +
                "\n" + "// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");

        int[][] fourArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (i + k == 4 || i - k == 0) {
                    fourArr[i][k] = 1;
                } else {
                    fourArr[k][i] = 0;
                }
                System.out.print(fourArr[i][k] + "\t");
            }
            System.out.println();
        }

//5 Задание
        System.out.println("\n5. Задать одномерный массив и найти в нем минимальный и максимальный элементы");


        int fiveArr[] = {301, 6 , 21, 5036, 10, 45, 125, 31, 95, 2};

        int min;
        int max;
        min = max = fiveArr[0];
        for (int i = 0; i < fiveArr.length; i++) {
            if(fiveArr[i] < min){
                min = fiveArr[i];
            }if (fiveArr[i] > max){
                max = fiveArr[i];
            }
        }
        System.out.println(Arrays.toString(fiveArr) + " \nmini " + min + " \nmaxi " + max);
    }




//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.


//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

}
