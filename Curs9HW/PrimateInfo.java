package Curs9HW;

interface BasicNeeds {
    String eat();

    void sleep();

    void drink();
}

abstract class Primate {
    void walk() {
    };

    void run() {
    };

    void speak() {
    };
}

class Human extends Primate implements BasicNeeds {
    @Override
    public void walk() {
        System.out.println("Can walk");
    }

    @Override
    public void run() {
        System.out.println("Can run");
    }

    @Override
    public void speak() {
        System.out.println("Can speak");
    }

    @Override
    public String eat() {
        return "Omnivore";
    }

    @Override
    public void sleep() {
        System.out.println("I need to sleep!");
    }

    @Override
    public void drink() {
        System.out.println("I drink water");
    }

    Human() {
        System.out.println("Primate dataType instance of Human:");
        System.out.println("-------------------------------------");
        walk();
        run();
        speak();
        System.out.println(eat());
        sleep();
        drink();
        System.out.println();
    }

}

class Monkey extends Primate implements BasicNeeds {
    @Override
    public void walk() {
        System.out.println("Can walk");
    }

    @Override
    public void run() {
        System.out.println("Can run");
    }

    @Override
    public void speak() {
        System.out.println("Cannot speak");
    }

    @Override
    public String eat() {
        return "Mostly erbivore";
    }

    @Override
    public void sleep() {
        System.out.println("I need to sleep!");
    }

    @Override
    public void drink() {
        System.out.println("I drink water");
    }

    Monkey() {
        System.out.println("Primate dataType instance of Monkey:");
        System.out.println("-------------------------------------");
        walk();
        run();
        speak();
        System.out.println(eat());
        sleep();
        drink();
        System.out.println();
    }
}

public class PrimateInfo {
    public static void main(String[] args) {
        Human h = new Human();
        Monkey m = new Monkey();
    }
}
