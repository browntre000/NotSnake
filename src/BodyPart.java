import java.awt.*;

public class BodyPart {

    int xSize = 30;
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

        if(x >= board.getWidth())
            x = 0;
        if(x <= -xSize)
            x = board.getWidth();
        if(y >= board.getHeight())
            y = 0;
        if(y <= -xSize)
            y = board.getHeight();
    }

    public void move(String direction, int xPos, int yPos){
        if(direction.equals("up")){
            x = xPos;
            y = yPos + speed;
        }
        else if(direction.equals("down")){
            x = xPos;
            y = yPos - speed;
        }
        else if(direction.equals("left")){
            x = xPos - speed;
            y = yPos;
        }
        else{
            x = xPos + speed;
            y = yPos;
        }

        if(x >= board.getWidth())
            x = 0;
        if(x <= -xSize)
            x = board.getWidth();
        if(y >= board.getHeight())
            y = 0;
        if(y <= -xSize)
            y = board.getHeight();
    }

    public void paint(Graphics g){
        g.fillOval(x, y, xSize, xSize);
    }

    public boolean checkCollisionWithFruit(Fruit fruit, int x, int y){
        if ((Math.abs(x - fruit.getX()) <= fruit.getDiameter()) && (Math.abs(y - fruit.getY()) <= fruit.getDiameter())) {
            return true;
        }
        else{
            return false;
        }
    }

    public void setPosition(int x, int y){
        this.x = x - xSize/2;
        this.y = y - xSize/2;
    }

    //Increase Diameter and Speed
    public void plus1(){
        xSize += 5;
        speed += 1;
    }



    //Getters
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getXSize() {
        return xSize;
    }

    public int getSpeed() {
        return speed;
    }

}
