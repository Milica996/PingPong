import javax.swing.*;
import java.awt.*;

public class racket {
    static int sizeRacketW = 24;
    static int sizeRacketH = 80;


    static int Y=150;
    static int Y2=150;

    static public int getY(){
        return Y;
    }

    static public int getY2() {
        return Y2;
    }

    public void move(int i) {
        if(i==1) {
            if(Y <= 1) {
                Y = Y;
            }
            else {
                Y=Y-8;
            }
        }
        else {
            if(Y >= main.H - 110) {
                Y=Y;
            }
            else {
                Y=Y+8;
            }
        }
    }

    public void move1(int i) {
        if(i==1) {
            if(Y2 <= 1) {
                Y2 = Y2;
            }
            else {
                Y2=Y2-8;
            }
        }
        else {
            if(Y2 >= main.H - 110) {
                Y2=Y2;
            }
            else {
                Y2=Y2+8;
            }
        }
    }
}
