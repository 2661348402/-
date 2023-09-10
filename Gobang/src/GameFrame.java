
//绘制窗口

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame(){
        setLayout(null);
        setTitle("五子棋");
        setSize(1080,850);
        getContentPane().setBackground(Color.gray);
        setResizable(false);
        setLocationRelativeTo(null);//居中

        GamePanel1 panel1=new GamePanel1();
        GamePanel2 panel2=new GamePanel2(panel1);

        panel1.setGamePanel2(panel2);
        panel1.init();

        add(panel2);
        add(panel1);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new GameFrame();
    }


}
