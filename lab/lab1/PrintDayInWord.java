package lab.lab1;

public class PrintDayInWord {
    public static void a(int variable) {
        if (variable == 0) {
            System.out.println("Sunday");
        } else if (variable == 1) {
            System.out.println("Monday");
        } else if (variable == 2) {
            System.out.println("Tuesday");
        } else if (variable == 3) {
            System.out.println("Wednesday");
        } else if (variable == 4) {
            System.out.println("Thursday");
        } else if (variable == 5) {
            System.out.println("Friday");
        } else if (variable == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day.");
        }
    }

    public static void b(int variable) {
        switch (variable) {
            case 0: {
                System.out.println("Sunday");

                break;
            }
            case 1: {
                System.out.println("Monday");

                break;
            }
            case 2: {
                System.out.println("Tuesday");

                break;
            }
            case 3: {
                System.out.println("Wednesday");

                break;
            }
            case 4: {
                System.out.println("Thursday");

                break;
            }
            case 5: {
                System.out.println("Friday");

                break;
            }
            case 6: {
                System.out.println("Saturday");

                break;
            }
            default: {
                System.out.println("Not a valid day.");

            }
        }
    }

    public static void main(String[] args) {
        int dayNumber = 5;
        a(dayNumber);
        b(dayNumber);
    }
}
