package geekbrains.ru_java_lesson_6_prod_OOP.Animal;

public class Kot extends Animal{


    public Kot (String name){
        super(name);
        this.maxRun = random.nextInt(45) + 155;
        this.type = "Кошка";
    }
    @Override
    public void swim(int dist) {
        System.out.println("Кошаки не умеют плавать!!!");
    }
}
