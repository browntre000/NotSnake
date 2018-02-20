import java.awt.*;
import java.util.Random;

public class Ball {
    int x, y, diameter, dx, dy;
    Random random = new Random();
    Board board;

    public Ball(Board board) {
        diameter = random.nextInt(75) + 25;
        x = random.nextInt(board.getWidth()) - diameter;
        y = random.nextInt(board.getHeight()) - diameter;
        dx = random.nextInt(16) - 8;
        while(dx != 0){
            dx = random.nextInt(16) - 8;
        }
        dy = random.nextInt(16) - 8;
        while(dy != 0){
            dy = random.nextInt(16) - 8;
        }
        this.board = board;
    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x, y, diameter, diameter);
    }


    public void collideWithBody(Body body){

    }

    public void move(){

        x += dx;
        y += dy;

        if(x >= board.getWidth() - diameter)
            dx *= -1;
        if(x <= 0)
            dx *= -1;
        if(y >= board.getHeight() - diameter)
            dy *= -1;
        if(y <= 0)
            dy *= -1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiameter() {
        return diameter;
    }
}