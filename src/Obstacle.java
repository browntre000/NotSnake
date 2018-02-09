import java.awt.*;

public class Obstacle {
    int x, y, xSize, ySize;

    public Obstacle(Board board) {

        xSize = board.getWidth() / 2;
        ySize = board.getHeight() / 2;
        x = (int) Math.random() * board.getWidth() - xSize;
        y = (int) Math.random() * board.getHeight() - ySize;
    }


    public void paint(Graphics g){
        g.fillRect(x, y, xSize, ySize);
    }
}
