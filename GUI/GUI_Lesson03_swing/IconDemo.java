package GUI.GUI_Lesson03_swing;

import javax.swing.*;
import java.awt.*;

public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;

    IconDemo(){}
    IconDemo(int width,int height){
        this.height=height;
        this.width=width;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    public void init(){
        IconDemo id=new IconDemo(20,20);

        setBounds(400,300,300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container=getContentPane();
        container.setBackground(Color.green);
        JLabel label=new JLabel("icon测试",id,SwingConstants.CENTER);
        container.add(label);

    }

    public static void main(String[] args) {
        new IconDemo().init();
    }
}
