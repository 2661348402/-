package GUI.GUI_Lesson01_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleCalcDemo {
    public static void main(String[] args) {
        new SimpleCalc("计算器");

    }
}
class SimpleCalc extends Frame {
    TextField tf1,tf2,tf3;
    SimpleCalc(String title){
        super(title);
        //组件
      tf1=new TextField(10);
          tf2=new TextField(10);
         tf3=new TextField(15);
        Label lab=new Label("+");
        Button b=new Button("=");

        //布局
        setBounds(400,200,500,100);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(tf1);
        add(lab);
        add(tf2);
        add(b);
        add(tf3);
        pack();

        setVisible(true);
        //监听
        b.addActionListener(new myMonitor());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);

            }
        });
    }
   private  class myMonitor implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int num1=Integer.parseInt(tf1.getText());
            int num2=Integer.parseInt(tf2.getText());
            tf3.setText(String.valueOf(num2+num1));


        }
    }
}

