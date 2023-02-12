import javax.swing.*;
import java.util.ArrayList;


public class main {
    static int W = 600;
    static int H = 400;
    static JFrame frame = new JFrame("PingPong");
    static JLabel number = new JLabel();
    static JPanel panel = new JPanel();
    static ArrayList<String> ArrayOfKeys = new ArrayList<String>();

    static int q1; //счет
    static int q2;

    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(W,H);
        frame.add(new Display());


        ThreadLeft leftRacket = new ThreadLeft();
        leftRacket.start();

        ThreadRight RightRacket = new ThreadRight();
        RightRacket.start();

        animation anime = new animation();
        anime.start();

        MoveBall animationBall = new MoveBall();
        animationBall.start();

        frame.setVisible(true);
    }

}
