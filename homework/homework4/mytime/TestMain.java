package homework.homework4.mytime;

public class TestMain {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(4, 2, 3);
        System.out.println(time1);

        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1);
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());
        time1.setTime(23, 59, 59);
        System.out.println(time1);

        System.out.println(time1.nextSecond());
        System.out.println(time1.previousSecond());

        time1.setTime(20, 59, 30);
        System.out.println(time1.nextMinute());
        System.out.println(time1.previousMinute());

        time1.setTime(23, 30, 15);
        System.out.println(time1.nextHour());
        System.out.println(time1.previousHour());
    }
}
