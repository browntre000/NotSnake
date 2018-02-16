import java.awt.*;
import java.util.Random;

public class Obstacle {
    int x, y, xSize, ySize;
    Random random = new Random();
    Board board;


    public Obstacle(Board board) {
        xSize = random.nextInt(board.getWidth()) / 2;
        ySize = random.nextInt(board.getHeight()) / 2;
        x = random.nextInt(board.getWidth()) / 2;
        y = random.nextInt(board.getHeight()) / 2;
    }


    public void paint(Graphics g){
        g.fillRect(this.x, this.y, xSize, ySize);
    }

}
