package GUI.GUI_Lesson04_swing;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo extends JFrame {
    JButtonDemo(){
        setBounds(200,100,200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container=getContentPane();
        container.setLayout(new BorderLayout());

        JRadioButton jr1=new JRadioButton("变帅");
        JRadioButton jr2=new JRadioButton("暴富");
        JRadioButton jr3=new JRadioButton("做梦");

        ButtonGroup bg=new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);

        container.add(jr1,BorderLayout.NORTH);
        container.add(jr2,BorderLayout.SOUTH);
        container.add(jr3,BorderLayout.WEST);


    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
