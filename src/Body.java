import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Body {

    List<BodyPart> body;
    Board board;

    public Body(Board board){
        body = new ArrayList<BodyPart>();
        this.board = board;
        for(int i = 0; i < 5; i++){
            body.add(new BodyPart(5, 5, board));
        }
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
        if(Game.isUpPressed())
            for(int i = 0; i < body.size(); i++)
                body.get(i).move("up");
        else if(Game.isDownPressed())
            for(int i = 0; i < body.size(); i++)
                body.get(i).move("down");
        else if(Game.isLeftPressed())
            for(int i = 0; i < body.size(); i++)
                body.get(i).move("left");
        else
            for(int i = 0; i < body.size(); i++)
                body.get(i).move("right");
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
            body.add(new BodyPart(lastX, lastY, board));
            addBody();
        }
    }

    public int getSize(){
        return body.size();
    }
}
