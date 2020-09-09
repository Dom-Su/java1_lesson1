package geekbrains.ru_java_lesson_6_prod_OOP.Animal;

import java.util.Random;


public class Animal {
  protected String name;
  protected String type;
  protected int maxRun;
  protected int maxSwim;

  public Random random = new Random();


    public Animal(String name) {
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) {
            System.out.println(this.type + " " + this.name + " пробежал(а) " + dist + " м.");
        }
        else{
            System.out.println(this.type + " " + this.name + " не может бежать так далеко");
        }
    }


    public void swim(int dist) {
        if (this.maxSwim >= dist){
            System.out.println(this.type + " " + this.name + " проплыл(а) " + dist + " м.");
        }
        else{
            System.out.println(this.type + " " + this.name + " не может плыть так далеко");
        }
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " \nМожет пробежать - " + this.maxRun + " м.,\n" + "Может проплыть - " + this.maxSwim);
    }

}
