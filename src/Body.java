import java.util.ArrayList;
import java.util.List;

public class Body {

    List<BodyPart> body;

    public Body(){
        body = new ArrayList<BodyPart>();
        for(int i = 0; i < 5; i++){
            body.add(new BodyPart());
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


}
