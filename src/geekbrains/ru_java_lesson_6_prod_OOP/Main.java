package geekbrains.ru_java_lesson_6_prod_OOP;

import geekbrains.ru_java_lesson_6_prod_OOP.Animal.*;

public class Main {
    public static void main(String[] args) {
    Kot cat = new Kot("Уголёк");
    Sobaka dog = new Sobaka("Тревога");

    cat.info();
        System.out.println();
    dog.info();

        System.out.println();

    cat.swim(1);
    dog.swim(100);

        System.out.println();

    cat.run(70);
    dog.run(300);
    }

}
