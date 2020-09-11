package geekbrains.ru_java_lesson_7_practice_oop;



public class Main {
    public static void main(String[] args) {

        System.out.println("Список кошек: ");

        Cat[] x = {new Cat("Уголёк"), new Cat("Мушка"), new Cat("Гаврюшка"),
                new Cat("Шишка"), new Cat("Обормот"), new Cat("ПустоРот")};
        Plate plate = new Plate(0);


        for (Cat c : x) {
            System.out.println(c);
        }

        System.out.println("\n" + plate);
        System.out.println("***********************************************\n");
        System.out.println("добавляем еду ");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Кошки жрут:\n");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}

