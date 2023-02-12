import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    public void paint(Graphics g) {
        g.setColor(new Color(1, 33, 47));
        g.fillRect(0, 0, main.W, main.H);

        g.setColor(Color.white);
        g.drawString(""+main.q1+"|"+""+main.q2, 290, 10);
        g.fillRect(0,racket.Y,racket.sizeRacketW,racket.sizeRacketH);
        g.fillRect(561,racket.Y2,racket.sizeRacketW,racket.sizeRacketH);
        g.fillOval(ball.X,ball.Y, 15, 15);

        repaint();
    }
}