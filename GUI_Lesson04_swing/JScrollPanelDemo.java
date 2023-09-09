package GUI.GUI_Lesson04_swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPanelDemo extends JFrame {
    JScrollPanelDemo(){
        setBounds(200,100,600,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TextArea ta=new TextArea(1,1);
        ta.setText("欢迎来到快乐向前冲");

        JScrollPane js=new JScrollPane(ta);
        Container container=getContentPane();
        container.add(js);

    }
    public static void main(String[] args) {
        new JScrollPanelDemo();

    }
}
