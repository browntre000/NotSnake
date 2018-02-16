import java.awt.*;
import java.util.Random;

public class Ball {
    int x, y, diameter;
    Random random = new Random();

    public Ball(Board board) {
        diameter = random.nextInt(75);
        x = random.nextInt(board.getWidth()) - diameter;
        y = random.nextInt(board.getHeight()) - diameter;
    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x, y, diameter, diameter);
    }

    public void setPosition(int x, int y){
        this.x = x - diameter/2;
        this.y = y - diameter/2;
    }
}