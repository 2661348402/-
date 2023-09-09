package GUI.GUI_Lesson03_swing;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public static void  creatJFrame(String title){

        JFrame jf=new JFrame(title);
        Container con=jf.getContentPane();
        JLabel jl=new JLabel("格格巫爱java");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jf.setBounds(400,200,500,500);
       //con.setBounds(400,200,500,500);
       con.setBackground(Color.green);
       con.add(jl);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        creatJFrame("JFrame");
    }
}

