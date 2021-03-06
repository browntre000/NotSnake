import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Body {

    List<BodyPart> body;
    Board board;
    int bodyLength;
    int up, down, left, right;

    public Body(Board board){
        body = new ArrayList<BodyPart>();
        this.board = board;
        for(int i = 0; i < 5; i++){
            body.add(new BodyPart(5, 5, board));
        }
        bodyLength = 5;
    }

    public void addBody(){
        for(int i = 0; i < 5; i++){
            int lastX = body.get(body.size() - 1).getX();
            int lastY = body.get(body.size() - 1).getY();
            body.add(new BodyPart(lastX, lastY, board));
        }
        for(int i = 0; i < body.size(); i++){
            body.get(i).plus1();
        }
    }

    public void move(){

        for(int i = 0; i < body.size(); i++) {
            if (body.size() == 1) {
                if (Game.currentDirection().equals("up")) {
                    body.get(i).move("up");
                } else if (Game.currentDirection().equals("down")) {
                    body.get(i).move("down");
                } else if (Game.currentDirection().equals("right")) {
                    body.get(i).move("right");
                } else if (Game.currentDirection().equals("left")) {
                    body.get(i).move("left");
                }
            } else {
                if (!Game.lastDirection().equals("up")) {
                    if (Game.currentDirection().equals("down"))
                        body.get(i).move("down");
                    if(Game.currentDirection().equals("left"))
                        body.get(i).move("left");
                    if(Game.currentDirection().equals("right"))
                        body.get(i).move("right");
                } else if (!Game.lastDirection().equals("down")) {
                    if (Game.currentDirection().equals("up"))
                        body.get(i).move("up");
                    if(Game.currentDirection().equals("left"))
                        body.get(i).move("left");
                    if(Game.currentDirection().equals("right"))
                        body.get(i).move("right");
                } else if (!Game.lastDirection().equals("left")){
                    if (Game.currentDirection().equals("up"))
                        body.get(i).move("up");
                    if(Game.currentDirection().equals("left"))
                        body.get(i).move("left");
                    if(Game.currentDirection().equals("down"))
                        body.get(i).move("down");
                } else if (!Game.lastDirection().equals("right")) {
                    if (Game.currentDirection().equals("up"))
                        body.get(i).move("up");
                    if(Game.currentDirection().equals("right"))
                        body.get(i).move("right");
                    if(Game.currentDirection().equals("down"))
                        body.get(i).move("down");
                }
            }
        }
    }

    public void paint(Graphics g){
        for(int i = 0; i < body.size(); i++){
            body.get(i).paint(g);
        }
    }

    public void setPosition(int x, int y){
        for(BodyPart bodyPart : body){
            bodyPart.setPosition(x, y);
        }
    }

    public BodyPart getPart(int i){
        return body.get(i);
    }

    public void collideWithFruit(Fruit fruit){
        boolean isTouching = false;
        int lastX = body.get(body.size() - 1).getX(), lastY = body.get(body.size() - 1).getY();
        for(int i = 0; i < body.size() - 1; i++){
            isTouching = body.get(i).checkCollisionWithFruit(fruit, lastX, lastY);
            i = body.size();
        }
        if(isTouching) {
            board.increaseScore(fruit.getFruitValue());
            body.add(new BodyPart(lastX, lastY, board));
            addBody();
        }
    }

    public int getSize(){
        return body.size();
    }
}
