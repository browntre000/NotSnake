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

    public void addBody(BodyPart bodyPart){
        for(int i = 0; i < 5; i++){
            int lastX = body.get(body.size() - 1).getX();
            int lastY = body.get(body.size() - 1).getY();
            body.add(new BodyPart(lastX, lastY));
        }
        for(int i = 0; i < body.size(); i++){
            body.get(i).plus1();
        }
    }

    public void move(){
        for(int i = 0; i < body.size(); i++){
            body.get(i).move();
        }
    }

    public void paint(Graphics g){
        for(int i = 0; i < body.size(); i++){
            body.get(i).paint(g);
        }
    }


}
