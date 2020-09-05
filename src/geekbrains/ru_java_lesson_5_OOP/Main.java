package geekbrains.ru_java_lesson_5_OOP;

public class Main {
    public static void main(String[] args) {
        Workman[] workmen = new Workman[5];

        workmen[0] = new Workman("Иванов Иван Иваныч", "ivanov@mail.ru", 40, 110, 10000, "Грузчик");
        workmen[1] = new Workman("Сидоров Сидр Сидорович","sidorov@mail.ru",36, 111, 15000, "мл. дворник");
        workmen[2] = new Workman("Петров Петр Петрович","petrov@mail.ru",52, 112, 26000, "Старший продавец");
        workmen[3] = new Workman("Васин Вася Васильевич","vasin@mail.ru",27, 113, 7000, "Парень работящий");
        workmen[4] = new Workman("Луков Лук Чеснокович","lukov@mail.ru",48, 114, 30000, "Начальник охраны");
        for (int i = 0; i < workmen.length; i++) {
            if(workmen[i].getAge() >= 40){
                workmen[i].printInfo();
            }
        }
    }
}
