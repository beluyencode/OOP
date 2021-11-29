package homework.homework6.bai6;

public class BigDog extends Animal {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");        
    }

    public void greets(Dog another) {
        System.out.println("Wooooooow");        
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooooooooooooooooooooow");        
    }
    
}
