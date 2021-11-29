package lab.lab1;

public class PrintNumberInWord {
    public static void a(int var) {
        if (var == 1) {
            System.out.println("ONE");
        } else if (var == 2) {
            System.out.println("TWO");
        } else if (var == 3) {
            System.out.println("THREE");
        } else if (var == 4) {
            System.out.println("FOUR");
        } else if (var == 5) {
            System.out.println("FIRE");
        } else if (var == 6) {
            System.out.println("SIX");
        } else if (var == 7) {
            System.out.println("SEVEN");
        } else if (var == 8) {
            System.out.println("EIGHT");
        } else if (var == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    public static void b(int var) {
        switch (var) {
            case 1: {
                System.out.println("ONE");
                break;
            }
            case 2: {
                System.out.println("TWO");
                break;
            }
            case 3: {
                System.out.println("THREE");
                break;
            }
            case 4: {
                System.out.println("FOUR");
                break;
            }
            case 5: {
                System.out.println("FIRE");
                break;
            }
            case 6: {
                System.out.println("SIX");
                break;
            }
            case 7: {
                System.out.println("SEVEN");
                break;
            }
            case 8: {
                System.out.println("EIGHT");
                break;
            }
            case 9: {
                System.out.println("NINE");
                break;
            }
            default : {
                System.out.println("OTHER");
            }
        }
    }

    public static void main(String[] args) {
        int number = 1;
        a(number);
        b(number);

    }
}
