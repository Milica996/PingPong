import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MoveBall extends Thread {

    int flager = 0;
    ball qwe = new ball();

    public void run(){
        int xc = ball.getXB();
        int yc = ball.getYB();

        while(true) {
            main.q1 = 0;
            main.q2 = 0;

            flager = 0;
            //обнулить счет

            while(flager == 0) { //сюда приделать условие выхода по нажатию клавиши- рестарт

                main.frame.addKeyListener(new KeyListener() {

                    public void keyTyped(KeyEvent e) {}

                    public void keyPressed(KeyEvent e) {

                        switch(e.getKeyChar()) {
                            case 'r':
                                flager = 1;
                                break;
                        }
                    }

                    public void keyReleased(KeyEvent e) {}

                });

                qwe.X = 50;
                qwe.Y = 180;
                xc = ball.getXB();
                yc = ball.getYB();

                ball.speedX = 2;
                ball.speedY = 0;


                while(xc<565 && xc > 10 && flager == 0) {
                    xc = ball.getXB();
                    yc = ball.getYB();

                    qwe.startMove(qwe.move());
                    qwe.move();

                    try {
                        Thread.sleep(10);

                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(xc<10) {
                    main.q2++;
                }
                else if(xc>564){
                    main.q1++;
                }
            }
        }
    }
}
