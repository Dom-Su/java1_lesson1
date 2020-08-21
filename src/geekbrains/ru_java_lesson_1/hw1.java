package geekbrains.ru_java_lesson_1;

public class hw1 {

    public static void main(String[] args) {
        secondZ();
        System.out.println("a * (b + (c / d)) = " + thirdZ(1, 2, 3, 4));
        System.out.println(fourZ(1, 8));
        fiveZ(-7);
        System.out.println(sixZ(-1));
        sevenZ("Андрей");
    }


    //2.Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void secondZ() {
        System.out.println("Задание 2.");
        int i = 777;
        byte bt = 0;
        short s = 123;
        float f = 777.0f;
        double d = 777.777;
        long l = 77777L;
        char c = 'x';
        boolean b = false;
        System.out.println("Значение int = " + i);
        System.out.println("Значение byte = " + bt);
        System.out.println("Значение short = " + s);
        System.out.println("Значение float = " + f);
        System.out.println("Значение double = " + d);
        System.out.println("Значение long = " + l);
        System.out.println("Значение char = [" + c + "]");
        System.out.println("Значение boolean = " + b);

    }

    //3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    static int thirdZ(int a, int b, int c, int d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }

    //4.Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean fourZ(int a, int b) {
        System.out.println("\nЗадание 4.");
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    //5.Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void fiveZ(int a) {
        System.out.println("\nЗадание 5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else
            System.out.println("Число " + a + " отрицательное");
    }

    //6.Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean sixZ(int a) {
        System.out.println("\nЗадание 6.");
        if (a < 0)
            return true;
        else
            return false;
    }

    //7.Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void sevenZ(String name) {
        System.out.println("\nЗадание 7.");
        System.out.println("Привет, " + name + "!");
    }
}