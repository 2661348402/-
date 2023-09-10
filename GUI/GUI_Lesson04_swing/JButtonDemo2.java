package GUI.GUI_Lesson04_swing;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo2 extends JFrame {
    JButtonDemo2(){
        setBounds(200,100,200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container=getContentPane();
        container.setBackground(Color.green);

        JCheckBox jc1=new JCheckBox("高");
        JCheckBox jc2=new JCheckBox("富");
        JCheckBox jc3=new JCheckBox("帅");

        container.add(jc1,BorderLayout.SOUTH);
        container.add(jc2,BorderLayout.EAST);
        container.add(jc3,BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new JButtonDemo2();
    }
}
