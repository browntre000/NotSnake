import java.awt.*;

public class Fruit {
    int x, y, diameter = 25, fruitType, fruitValue;

    public Fruit(Board board) {
        fruitType = (int) Math.random() * 7;
        fruitValue = fruitType * 50;
        x = (int) Math.random() * board.getWidth() - diameter;
        y = (int) Math.random() * board.getHeight() - diameter;
    }


    public void paint(Graphics g){
        g.fillOval(x, y, diameter, diameter);
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
    }
}
