package homework.homework5.part1.bai5;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Mammal[%s]", super.toString());
    }

    
}
