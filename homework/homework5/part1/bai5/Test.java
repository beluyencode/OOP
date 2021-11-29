package homework.homework5.part1.bai5;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("a");
        System.out.println(animal);
        Animal mammal = new Mammal("b");
        System.out.println(mammal);
        Animal cat = new Cat("meo");
        System.out.println(cat);
        ((Cat) cat).greets();
        Dog dog = new Dog("cho");
        System.out.println(dog);
        dog.greets();
        animal = new Dog("UmU");
        dog.greets((Dog) animal);
    }
}
