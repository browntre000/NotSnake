import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{

    Body body;
    Fruit fruit;
    Timer timer;
    int width = 1000, height = 800;
    int score = 0;

    public Board(Game game){
        setBackground(Color.black);
        setPreferredSize(new Dimension(1000, 800));
        body = new Body(this);
        fruit = new Fruit(this);

    }

    public void startGame(){
        body.setPosition(50, 50);
        fruit.setPosition(100, 50);
        timer = new Timer(1000/60, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e){
        body.move();
        body.collideWithFruit(fruit);
        fruit.checkCollisionWithBody(body);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.WHITE);

        body.paint(g);
        fruit.paint(g);
        g.setColor(Color.PINK):
        printSimpleString(Integer.toString(score), getWidth()/2, 0, DECORSIZE*2, g);
    }

    private void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
    }

    @Override
    public int getHeight(){
        return this.height;
    }

    @Override
    public int getWidth(){
        return this.width;
    }
    
    public void increaseScore(int score){
        this.score += score;
    }
}
