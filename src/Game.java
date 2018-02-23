import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Game extends JFrame implements KeyListener {

    public static void main(String[] args){
        new Game();
    }

    Board board;

    public Game(){
        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board(this);
        add(board);
        addKeyListener(this);
        pack();
        setLocationRelativeTo(null);
        board.startGame();
    }

    private static boolean upPressed = false, downPressed = false, leftPressed = false, rightPressed = true;

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

    public static boolean isUpPressed(){
        return upPressed;
    }

    public static boolean isDownPressed(){
        return downPressed;
    }

    public static boolean isLeftPressed() {
        return leftPressed;
    }

    public static boolean isRightPressed() {
        return rightPressed;
    }

    public static String whichPressed(){
        if(upPressed)
            return "up";
        if(downPressed)
            return "down";
        if(leftPressed)
            return "left";
        if(rightPressed)
            return "right";
    }
}
