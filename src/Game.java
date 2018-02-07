import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Game extends JFrame implements KeyListener {

    private boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            upPressed = true;
            downPressed = false;
            leftPressed = false;
            rightPressed = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            downPressed = true;
            upPressed = false;
            leftPressed = false;
            rightPressed = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            leftPressed = true;
            rightPressed = false;
            upPressed = false;
            downPressed = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            rightPressed = true;
            leftPressed = false;
            upPressed = false;
            downPressed = false;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    public boolean isUpPressed(){
        return upPressed;
    }

    public boolean isDownPressed(){
        return downPressed;
    }

    public boolean isLeftPressed() {
        return leftPressed;
    }

    public boolean isRightPressed() {
        return rightPressed;
    }
}
