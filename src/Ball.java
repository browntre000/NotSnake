import java.awt.*;

public class Ball {
    int x, y, diameter = (int)(Math.random() * 50);

    public Ball(Board board) {
        x = (int) Math.random() * board.getWidth() - diameter;
        y = (int) Math.random() * board.getHeight() - diameter;
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