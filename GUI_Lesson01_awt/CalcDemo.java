package GUI.GUI_Lesson01_awt;

import java.awt.*;

//简单计算器的制作
public class CalcDemo {
    public static void main(String[] args) {
        Calc calc=new Calc("计算器");
    }

}
class Calc extends Frame{
    Calc(String title){
        super(title);

        //组件
        TextField tf1=new TextField(10);
        TextField tf2=new TextField(20);
        Panel p=new Panel();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button bj=new Button("+");
        Button bn=new Button("-");
        Button bc=new Button("*");
        Button bu=new Button("/");
        Button bd=new Button("=");
        Button b0=new Button("0");
        Button bi=new Button("");
        //参数设置
        setBounds(400,200,500,700);
//       tf1.setBounds(0,0,500,200);
//        tf2.setBounds(0,200,500,200);
        p.setBounds(0,400,500,300);

       //布局
        setLayout(new FlowLayout());
        p.setLayout(new GridLayout(4,4));

        add(tf1);
        add(tf2);
        add(p);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bj);

        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bn);

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bc);

        p.add(b0);
        p.add(bi);
        p.add(bd);
        p.add(bu);

        pack();

        setVisible(true);

    }
}
