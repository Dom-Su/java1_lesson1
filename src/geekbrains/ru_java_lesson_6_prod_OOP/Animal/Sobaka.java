package geekbrains.ru_java_lesson_6_prod_OOP.Animal;

public class Sobaka extends Animal {

    public Sobaka(String name) {
         super (name);
        this.type = "Пёс";
        this.maxRun = random.nextInt(300) + 200;
        this.maxSwim = random.nextInt(6) + 5;
    }

}
