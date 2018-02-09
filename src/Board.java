import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener{

    Body body;
    Obstacle obstacle;
    Fruit fruit;
    Ball ball;
    Timer timer;

    public Board(Game game){
        setBackground(Color.blue);
        setPreferredSize(new Dimension(1000, 800));
        body = new Body(this);
        obstacle = new Obstacle(this);
        fruit = new Fruit(this);
        ball = new Ball();

    }

    public void startGame(){
        timer = new Timer(1000/60, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e){

    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.ORANGE);

        body.paint(g);
        obstacle.paint(g);
        fruit.paint(g);
    }

    private void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
    }

}
