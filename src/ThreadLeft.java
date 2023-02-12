import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Timer;

public class ThreadLeft extends Thread{
    static int W = 600;
    static int H = 400;

    static boolean upleftKey = false;
    static boolean up2leftKey = false;
    static boolean upRightKey = false;
    static boolean up2RightKey = false;

    static racket Left = new racket();

    public void run() {

        main.frame.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {}

            public void keyPressed(KeyEvent e) {

                switch(e.getKeyChar()) {
                    case 'w':
                        upleftKey = true;
                        break;
                    case's':
                        up2leftKey = true;
                        break;
                }
            }

            public void keyReleased(KeyEvent e) {
                switch(e.getKeyChar()) {
                    case 'w':
                        upleftKey = false;
                        break;
                    case's':
                        up2leftKey = false;
                        break;
                }
            }
        });
    }

    static public void animation() {
        if(upleftKey) {
            Left.move(1);
        }
        if(up2leftKey) {
            Left.move(2);
        }
    }
}

