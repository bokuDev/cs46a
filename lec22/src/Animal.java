public class Animal {
    public String name;
    public int age;

    Animal() {
        this.name = "";
        this.age = 0;
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " is making sound");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rolando", 8);
        Cat cat = new Cat("Isabella", 4);
        dog.makeSound();
        cat.makeSound();
    }
}

class Dog extends Animal {
    Dog() {
        super();
    }

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + ": Woof woof");
    }
}

class Cat extends Animal {
    Cat() {
        super();
    }

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + ": Miau Miau");
    }
}
