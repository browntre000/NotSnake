import java.awt.*;
import java.util.Random;

public class Fruit {
    int x, y, diameter = 25, fruitType, fruitValue;
    Board board;
    Random random = new Random();

    public Fruit(Board board) {
        fruitType = random.nextInt(7);
        fruitValue = fruitType * 50;
        x = random.nextInt(board.getWidth()) - diameter;
        y = random.nextInt(board.getHeight()) - diameter;
        this.board = board;
    }


    public void paint(Graphics g){
        switch(fruitType){
            case 0:
                g.setColor(Color.GRAY);
                break;
            case 1:
                g.setColor(Color.BLUE);
                break;
            case 2:
                g.setColor(Color.GREEN);
                break;
            case 3:
                g.setColor(Color.RED);
                break;
            case 4:
                g.setColor(Color.CYAN);
                break;
            case 5:
                g.setColor(Color.ORANGE);
                break;
            case 6:
                g.setColor(Color.YELLOW);
                break;
            default:
                System.out.print("Figure out what happened");
        }
        g.fillOval(x, y, diameter, diameter);
    }

    public void setPosition(int x, int y){
        this.x = x - diameter/2;
        this.y = y - diameter/2;
    }

    public void checkCollisionWithBody(Body body){
        if((Math.abs(body.getPart(0).getX() - x) <= diameter) && (Math.abs(body.getPart(0).getY() - y) <= diameter)){
            x = random.nextInt(board.getWidth()) - diameter;
            y = random.nextInt(board.getHeight()) - diameter;
        }
    }

    public int getFruitValue(){
        return this.fruitValue;
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
