import java.awt.*;

public class BodyPart {

    int diameter = 10;
    int x, y;
    int speed = 10;
    Board board;

    //Adding More
    public BodyPart(int x, int y, Boar){
        this.board = board;
        this.x = x;
        this.y = y;
    }


    //Initial Body Part
    public BodyPart(int x, int y, Board board){
        this.board = board;
        this.x = board.getWidth();
        this.y = board.getHeight();
    }

    //Moving
    public void move(){

    }

    public void paint(Graphics g){
        g.fillOval(x, y, diameter, diameter);
    }

    //Increase Diameter and Speed
    public void plus1(){
        diameter += 5;
        speed += 3;
    }



    //Getters
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getSpeed() {
        return speed;
    }

}
