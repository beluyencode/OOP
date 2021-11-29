package homework.homework4.ballplayer;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        z = 0.0f;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }
    
    
    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        double distance = Math.sqrt((x - ball.getX()) * (x - ball.getX()) + (y - ball.getY()) * (y - ball.getY()));
        if (distance < 8)
            return true;
        else
            return false;
    }

    public void kick(Ball ball) {
        if(near(ball)){
            move(Math.abs(ball.getX() - x), Math.abs(ball.getY() - y));
            jump(Math.abs(ball.getZ() - z));
            System.out.println("shoot");
        }
        else{
            System.out.println("continue");
        }


    }
    public int getNumber() {
        return number;
    }
}
