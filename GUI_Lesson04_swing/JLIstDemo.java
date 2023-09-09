package GUI.GUI_Lesson04_swing;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class JLIstDemo extends JFrame {
    JLIstDemo(int num){
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container=getContentPane();
        if(num==1) {
            JComboBox status = new JComboBox();
            status.addItem("努力学习中");
            status.addItem("上班摸鱼中");
            status.addItem("无聊发呆中");
            status.addItem("单身汪汪汪");

            container.add(status);
        }
        else{
            Vector<String> names=new Vector<String>();
            names.add("张三");
            names.add("李四");
            names.add("王五");
            JList<String> list=new JList<String>(names);
            container.add(list);
        }

    }

    public static void main(String[] args) {
        new JLIstDemo(2);
    }
}
