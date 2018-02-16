import java.awt.*;

public class BodyPart {

    int diameter = 30;
    int x, y;
    int speed = 10;
    Board board;

    //Adding More
    public BodyPart(int x, int y, Board board){
        this.board = board;
        this.x = x;
        this.y = y;
    }


    //Initial Body Part
    public BodyPart(Board board){
        this.board = board;
        this.x = board.getWidth();
        this.y = board.getHeight();
    }

    //Moving
    public void move(String direction){
        if(direction.equals("up")){
            y -= speed;
        }
        else if(direction.equals("down")){
            y += speed;
        }
        else if(direction.equals("left")){
            x -= speed;
        }
        else{
            x += speed;
        }

        if(x >= board.getWidth() && Game.isRightPressed())
            x = 0;
        if(x <= 0 && Game.isLeftPressed())
            x = board.getWidth();
        if(y >= board.getHeight() && Game.isDownPressed())
            y = 0;
        if(y <= 0 && Game.isUpPressed())
            y = board.getHeight();
    }

    public void paint(Graphics g){
        g.fillRect(x, y, diameter, diameter);
    }

    public void setPosition(int x, int y){
        this.x = x - diameter/2;
        this.y = y - diameter/2;
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
