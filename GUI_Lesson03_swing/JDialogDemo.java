package GUI.GUI_Lesson03_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo extends JFrame {
   JDialogDemo(String title){
       super(title);
       setBounds(400,200,500,500);
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       Container container=getContentPane();
       container.setBackground(Color.green);

       JButton b=new JButton("按下弹出一个弹窗");
       b.setBackground(Color.red);
       container.add(b);
       b.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent e) {
               new myJDialog();
           }
       });
   }

    public static void main(String[] args) {
        new JDialogDemo("格格巫爱java");
    }
}
class myJDialog extends JDialog{
    myJDialog(){
        setVisible(true);
        setBounds(200,100,200,200);

        JLabel jl=new JLabel("没事就吃溜溜梅");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        Container con=getContentPane();
        con.add(jl);
    }
}