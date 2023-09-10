import javax.swing.*;
import java.awt.*;

public class HelpDialog extends JDialog {
    HelpDialog(){
        setSize(800,300);
        setLocation(400,400);
        TextArea ta=new TextArea();
        ta.setFont(new Font("华文宋体",Font.BOLD,25));
        ta.setText("（1）对局双方各执一色棋子。\n" +
                "（2）空棋盘开局。\n" +
                "（3）黑先、白后，交替下子，每次只能下一子。\n" +
                "（4）棋子下在棋盘的空白点上，棋子下定后，" +"\n"+
                "        不得向其它点移动，不得从棋盘上拿掉或拿起另落别处。\n" +
                "（5）黑方的第一枚棋子必须下在天元点上，即中心交叉点\n" +
                "（6）轮流下子是双方的权利，但允许任何一方放弃下子权（即：PASS权）。");
        add(ta);
    }
}
