package homework.homework4.ballplayer;

public class TestMain {
    public static void main(String[] args) {
        Ball ball= new Ball(10, 20, 3);
        Player player1= new Player(10, 5, 2);
        Player player2= new Player(9, 8, 18);
        
        player1.kick(ball);
        player2.kick(ball);
        
    }
}
