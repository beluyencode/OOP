package homework.homework4.bouncingballs;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        System.out.println(ball);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; step++) {
            ball.move();
            box.collidesWidth(ball);
            System.out.println(ball);
        }
    }
}
