public class tinhChatOOP {

}

// Tính đóng gói
class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Tính kế thừa
class student extends person {
    private int scores;

    public student(String name, int scores) {
        super(name);
        this.scores = scores;
    }
    //Tính đa hình
    @Override
    public String getName() {
        return super.getName()+" "+scores;
    }


    public int getScores() {
        return scores;
    }
}

//Tính trừu tượng
abstract class Animal {
    private String tiengKeu;
    public abstract void hienThiTiengKeu();
}

class Dog extends Animal {
 
    @Override
    public void hienThiTiengKeu() {
        System.out.println("Gâu");
    }
}
