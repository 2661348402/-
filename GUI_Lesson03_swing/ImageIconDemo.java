package GUI.GUI_Lesson03_swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    ImageIconDemo(){
        JLabel label=new JLabel("图片");

        URL url=ImageIconDemo.class.getResource("rwww.jpg");
        Icon icon=new ImageIcon(url);
        label.setIcon(icon);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);

        setBounds(400,200,500,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container=getContentPane();
        container.setBackground(Color.yellow);
        container.add(label);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }

}
