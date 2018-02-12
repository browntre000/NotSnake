import java.awt.*;

public class Obstacle {
    int x, y, xSize, ySize;

    public Obstacle(Board board) {

        xSize = (int) (Math.random() * 100) + 200;
        ySize = (int) (Math.random() * 100) + 200;
        x = (int) (Math.random() * 1000) - 500;
        System.out.println(x);
        y = (int) (Math.random() * 1000) - 500;
        System.out.println(y);
    }


    public void paint(Graphics g){
        g.drawRect(this.x, this.y, xSize, ySize);
    }

}
