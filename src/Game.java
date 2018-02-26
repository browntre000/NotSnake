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

        debugThings();
    }

    static int direction, lastDirection;

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if((e.getKeyCode() == KeyEvent.VK_UP)){
            lastDirection = direction;
            direction = 1;
        }
        if((e.getKeyCode() == KeyEvent.VK_DOWN)){
            lastDirection = direction;
            direction = 3;
        }
        if((e.getKeyCode() == KeyEvent.VK_LEFT)){
            lastDirection = direction;
            direction = 4;
        }
        if((e.getKeyCode() == KeyEvent.VK_RIGHT)){
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
                return "right";
            case 3:
                return "down";
            case 4:
                return "left";
            default:
                return "";
        }
    }

    public static String lastDirection(){
        switch(lastDirection) {
            case 1:
                return "up";
            case 2:
                return "right";
            case 3:
                return "down";
            case 4:
                return "left";
            default:
                return "";
        }
    }

    public void debugThings(){
        int i = direction;
        int j = 0;

        while((i == direction) && (j == lastDirection)){
            if(i != direction){
                System.out.println(direction);
            }
            else{
                System.out.print("");
            }

            if(i != lastDirection){
                System.out.println(lastDirection);
            }
            else{
                System.out.print("");
            }
        }
    }
}
