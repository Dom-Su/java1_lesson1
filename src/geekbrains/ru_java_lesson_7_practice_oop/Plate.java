package geekbrains.ru_java_lesson_7_practice_oop;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite){
            food -= appetite;
        }
    }

    void increaseFood(int amount){
        food += amount;
    }


    @Override
    public String toString() {
        return "В тарелке " + food + " еды";
    }
}
