interface Animal {
    void makeSound();
}

abstract class Bird {
    abstract void fly();
    void eat() {
        System.out.println("Bird is eating");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Bird sparrow = new Sparrow();
        sparrow.fly();
        sparrow.eat();
    }
}
