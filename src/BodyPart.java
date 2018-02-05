public class BodyPart {

    int diameter = 10;
    int x, y;
    int speed = 10;

    //Adding More
    public BodyPart(int x, int y){
        this.x = x;
        this.y = y;
    }


    //Initial Body Part
    public BodyPart(){
        this.x = 0;
        this.y = 0;
    }

    //Moving


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
