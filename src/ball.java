import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ball {

    static int X=50;
    static int Y=180;
    static int speedX = 2;
    static int speedY = 0;
    int flag = 0;

    public int move() {

        int d = racket.getY();
        int d2 = racket.getY2();
        if(((Y < d+80 && Y > d) && X <= 25) | ((Y < d2+80 && Y > d2) && X >= 544)) {
            //Шарик отскакивает в зависимости от того в какую часть ракетки он попал
            flag = 1;
            d = racket.getY();
            d2 = racket.getY2();

            //сделать больше секторов на ракетках минимум 5
            if(Y > d2 & Y < d2+20) { //0-20
                speedX = -3;
                speedY=-2;
            }
            if(Y > d2 + 60 & Y < d2 + 80) {//60-80
                speedX = -3;
                speedY = 2;

            }
            if(Y > d2+20 & Y < d2+40) {//20-40
                speedX = -3;
                speedY=-1;
            }
            if(Y > d2 + 40 & Y < d2 + 60) {//40-60
                speedX = -3;
                speedY = 1;

            }
            //left
            if(Y > d & Y < d + 20 & X<50) { //l 0-20
                speedX = 3;
                speedY = -2;

            }
            if(Y > d + 60 & Y <d + 80 &X<50) { //l 60-80
                speedX = 3;
                speedY = 2;

            }
            if(Y > d + 20 & Y < d + 40 & X<50) {//l 20-40
                speedX = 3;
                speedY = -1;

            }
            if(Y > d + 40 & Y <d + 60 &X<50) {//l 40-60
                speedX = 3;
                speedY = 1;

            }

        }

        if(((Y > d+80 | Y < d) && X <= 24) | ((Y > d2+80 && Y < d2) && X >= 550)) {
            //Подсчет очков
        }

        if(Y<=10 | Y >= 340) {
            //Шарик отскакивает от стенки
            if(Y <= 10 & speedX<0) {
                speedX = -3;
                speedY= 2;
            }
            else if(Y <= 10 & speedX>0) {
                speedX = 3;
                speedY = 2;
            }

            if(Y >= 340 & speedX >0) {
                speedX = 3;
                speedY = -2;
            }
            else if(Y >=340 & speedX<0){
                speedX = -3;
                speedY = -2;
            }
        }


        X = X + speedX;
        Y = Y + speedY;

        return flag; // передаем методу startMove что бы он остановился при достижении ракетки и начал выполняться метод move

    }


    static public void startMove(int i) {

        if(i==1) {}
        else {
            X = X + speedX;
            Y = Y + speedY;
        }
    }

    public static int getYB() {
        return Y;
    }

    public static int getXB() {
        return X;
    }

}
