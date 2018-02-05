import java.util.ArrayList;
import java.util.List;

public class Body {

    List<BodyPart> body;
    BodyPart bodyPart = new BodyPart();

    public Body(){
        body = new ArrayList<BodyPart>();
        body.add(bodyPart);
    }

    public void addBody(BodyPart bodyPart){
        if(bodyPart != null){
            body.add(bodyPart);
        }
    }


}
