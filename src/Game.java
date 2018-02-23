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

    static int direction = 2, lastDirection;

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if((e.getKeyCode() == KeyEvent.VK_UP) && !(direction != 3)){
            lastDirection = direction;
            direction = 1;
        }
        if((e.getKeyCode() == KeyEvent.VK_DOWN) && !(direction != 1)){
            lastDirection = direction;
            direction = 3;
        }
        if((e.getKeyCode() == KeyEvent.VK_LEFT) && !(direction != 2)){
            lastDirection = direction;
            direction = 4;
        }
        if((e.getKeyCode() == KeyEvent.VK_RIGHT) && !(direction != 4)){
            lastDirection = direction;
            direction = 2;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    public int getDirection() {
        return direction;
    }

    public int getLastDirection(){
        return lastDirection;
    }

    public static String currentDirection(){
        switch(direction) {
            case 1:
                return "up";
            case 2:
                return "down";
            case 3:
                return "left";
            case 4:
                return "right";
            default:
                return "";
        }
    }

    public static String lastDirection(){
        switch(lastDirection) {
            case 1:
                return "up";
            case 2:
                return "down";
            case 3:
                return "left";
            case 4:
                return "right";
            default:
                return "";
        }
    }
}
