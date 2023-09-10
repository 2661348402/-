import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel2 extends JPanel  {
    GamePanel1 gamePanel1;
    HelpDialog helpDialog=new HelpDialog();
    GamePanel2 (GamePanel1 gamePanel1){
       setBounds(780,0,290,820);
       setBackground(Color.LIGHT_GRAY);
       setLayout(new FlowLayout());
       this.gamePanel1=gamePanel1;

        //创建下拉框
        JComboBox<String > model=new JComboBox<String>();
        model.setPreferredSize(new Dimension(200,50));
        model.setFont(new Font("华文宋体",Font.BOLD,40));
        model.addItem("选择模式");
        model.addItem("人人对战");
        model.addItem("人机对战");
        model.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                gamePanel1.setModel((String) e.getItem());
            }
        });

        //创建按钮
        JButton button1=new JButton();
        JButton button2=new JButton();
        JButton button3=new JButton();
        JButton button4=new JButton();

        button1.setFont(new Font("华文宋体",Font.BOLD,30));
        button2.setFont(new Font("华文宋体",Font.BOLD,40));
        button3.setFont(new Font("华文宋体",Font.BOLD,40));
        button4.setFont(new Font("华文宋体",Font.BOLD,40));

        button1.setText("开始新游戏");
        button2.setText("悔棋");
        button3.setText("认输");
        button4.setText("帮助");

        button1.setPreferredSize(new Dimension(200,80));
        button2.setPreferredSize(new Dimension(200,80));
        button3.setPreferredSize(new Dimension(200,80));
        button4.setPreferredSize(new Dimension(200,80));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel1.setStart(true);
                gamePanel1.init();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if("人机对战".equals(gamePanel1.getModel())) {
                    new HuiQiDialog();
                }
                else{
                    int[] position=gamePanel1.pos;
                    gamePanel1.chessPieces[position[0]][position[1]].setType(0);
                    gamePanel1.chessPieces[position[0]][position[1]]=null;
                   gamePanel1.setWhite(gamePanel1.isWhite()^true);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(gamePanel1.isWhite()) {
                    new WinnerDialog("黑骑");
                }
                else{
                    new WinnerDialog("白起");
                }
                gamePanel1.setStart(false);
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                helpDialog.setVisible(true);
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                helpDialog.setVisible(false);
            }
        });



        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(model);


       setVisible(true);
    }

}
