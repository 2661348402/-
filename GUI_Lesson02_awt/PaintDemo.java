package GUI.GUI_Lesson02_awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class PaintDemo {
    public static void main(String[] args) {
        MyFrame mf=new MyFrame("画板");
       mf.repaint();

    }
}
class MyFrame extends Frame {
    ArrayList <Point> pionts=null;
    MyFrame frame=this;

    MyFrame(String title){
        super(title);
        setBounds(400,200,300,300);
        pionts=new ArrayList<>();
        setVisible(true);
        //监听器
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               Point point=new Point(e.getX(),e.getY());
               pionts.add(point);
               frame.repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Iterator it=pionts.iterator();
        while(it.hasNext()){
          Point  p = (Point) it.next();
            g.setColor(Color.red);
            g.fillOval((int)p.getX(),(int) p.getY(),10,10);

        }

    }
}

