import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class ThreadRight extends Thread{
    static int W = 600;
    static int H = 400;

    static boolean upleftKey = false;
    static boolean up2leftKey = false;
    static boolean upRightKey = false;
    static boolean up2RightKey = false;

    static racket Right = new racket();

    public void run() {

        main.frame.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {

                switch(e.getKeyChar()) {
                    case 'i':
                        upRightKey = true;
                        break;
                    case'k':
                        up2RightKey = true;
                        break;
                }
            }

            public void keyReleased(KeyEvent e) {
                switch(e.getKeyChar()) {
                    case 'i':
                        upRightKey = false;
                        break;
                    case'k':
                        up2RightKey = false;
                        break;
                }
            }
        });
    }

    static public void animation2() {
        if(upRightKey) {
            Right.move1(1);
        }
        if(up2RightKey) {
            Right.move1(2);
        }
    }
}

