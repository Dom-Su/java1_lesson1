package geekbrains.ru_java_lesson_7_practice_oop;

public class Cat {
    private String name;
    private int appetite = 20;
    private boolean fill;

    public Cat(String name){
        this.name = name;
        this.appetite = appetite;
        this.fill = false;
    }

    public void eat(Plate plate){
        if(plate.getFood() >= appetite){
            plate.decreaseFood(appetite);
            fill = true;
        }
        if (fill == false){
            System.out.println("\nСледующий кот уйдет голодным");
        }
    }

    @Override
    public String toString() {
        return "\nКот " + name + " голоден на: " + appetite + " пунктов" + "; сытость кошки = " + fill;
    }

}
