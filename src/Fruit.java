import java.awt.*;

public class Fruit {
    int x, y, diameter = 25, fruitType, fruitValue;
    Board board;

    public Fruit(Board board) {
        fruitType = (int) (Math.random() * 7);
        fruitValue = fruitType * 50;
        x = (int) Math.random() * board.getWidth() - diameter;
        y = (int) Math.random() * board.getHeight() - diameter;
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
        if(Math.abs(body.getPart(0).getX() - x) <= diameter){
            x = (int) Math.random() * board.getWidth() - diameter;
            y = (int) Math.random() * board.getHeight() - diameter;
        }
        if(Math.abs(body.getPart(0).getY() - y) <= diameter){
            x = (int) Math.random() * board.getWidth() - diameter;
            y = (int) Math.random() * board.getHeight() - diameter;
        }
    }

    public int getFruitValue(){
        return this.fruitValue;
    }
}
