import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class GamePanel1 extends JPanel {
    public static final int ROWs=15;
    public static final  int COLs=15;
    private  boolean isWhite=true;
    private GamePanel2 gamePanel2;
    private Image image=null;
   // private  boolean machineFirst=true;
    private  boolean isStart=false;
    private AI ai=new AI(this);
    private String model="选择模式";
    private  int step=1;
    //定义指示器数组
    Pointer[][] pointers=null;
    //定义棋子数组
    ChessPiece[][] chessPieces=null;
    //最后一颗棋子的位置
    int[]pos=new int[2];
    //数据初始化
   public void init() {
        setVisible(true);
        setBounds(0, 0, 780, 820);
        setBackground(new Color(209, 146, 17));

       image=new ImageIcon(
               "C:\\IdeaProjects\\HelloWorld\\src\\Gobang\\src\\background.jpg").getImage();

      pointers= new Pointer[ROWs][COLs];
      chessPieces=new ChessPiece[ROWs][COLs];
        creatPointer();
        creatMouseListener();
    }



    //get和set方法


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public void setGamePanel2(GamePanel2 gamePanel2) {
        this.gamePanel2 = gamePanel2;
    }

    //创建鼠标监听事件
    private void creatMouseListener() {

            MouseAdapter ma = new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    for (int i = 0; i < ROWs; i++) {
                        for (int j = 0; j < COLs; j++) {
                            //获取指示器对象
                            Pointer pointer = pointers[i][j];
                            if (isStart&&pointer.isPoint(x, y) &&
                                    pointer.getChessPiece().getType() == 0) {
                                chessPieces[i][j] = pointer.getChessPiece();
                                pos[0]=i;
                                pos[1]=j;
                                if("选择模式".equals(model)) {
                                    new SelectDialog();
                                }else{
                                    if (isWhite) {
                                        chessPieces[i][j].setType(1);
                                    } else if (true) {
                                        chessPieces[i][j].setType(2);
                                    }
                                    if ("人机对战".equals(model)) {
                                        if ((step++) == 0) {
                                            chessPieces[7][7] = pointers[7][7].getChessPiece();
                                            chessPieces[7][7].setType(2);
                                        } else {
                                            int[] position = ai.nextStep();
                                            chessPieces[position[0]][position[1]] =
                                                    pointers[position[0]][position[1]].getChessPiece();
                                            chessPieces[position[0]][position[1]].setType(2);
                                        }
                                        isWhite ^= true;

                                    }
                                    repaint();
                                    isWhite ^= true;
                                    whoIsWinner();
                                    return;
                                }
                            }
                        }
                    }
                }
            };
            MouseMotionAdapter mma = new MouseMotionAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    for (int i = 0; i < ROWs; i++) {
                        for (int j = 0; j < COLs; j++) {
                            if (isStart) {
                                Pointer p = pointers[i][j];
                                if (p.isPoint(x, y)) {
                                    p.setStates(true);
                                } else {
                                    p.setStates(false);
                                }
                            }
                        }
                    }
                    repaint();
                }
            };

            addMouseListener(ma);

            addMouseMotionListener(mma);
        }

    //创建数组内容
    private  void creatPointer(){
        int start=30;
        int x=0;
        int y=0;
        for (int i = 0; i <ROWs; i++) {
            for (int j = 0; j <COLs; j++) {
                x=start+j*50;
                y=start+i*50;
                pointers[i][j]=new Pointer(i,j,x,y);
                pointers[i][j].setChessPiece(new ChessPiece(pointers[i][j]));
            }
        }
    }
    //绘制指示器
    private void drawPointer(Graphics g){
        for (int i = 0; i <ROWs; i++) {
            for (int j = 0; j <COLs; j++) {
                Pointer p=pointers[i][j];
                if (p!=null) {
                    if (p.isStates()) {
                        p.draw(g);
                    }
                }
            }
        }
    }
    //绘制棋子
    private void drawChessPiece(Graphics2D g2){
        for (int i = 0; i <ROWs; i++) {
            for (int j = 0; j <COLs; j++) {
                ChessPiece cp = chessPieces[i][j];
                if (cp != null) {
                    if (cp.getType() == 1) {
                        cp.draw(g2, Color.white);
                    } else {
                        cp.draw(g2, Color.black);
                    }
                }
            }
        }
    }

    //判断输赢
    private void whoIsWinner(){

       //这里好像太笨了，只要判断最后一个落子的情况就行了
        int court=0;
        for (int i = 0; i <ROWs ; i++) {
            for (int j = 0; j <COLs; j++) {
                if(chessPieces[i][j]!=null){
                    int type=chessPieces[i][j].getType();
                    //判断横向
                    for (int m = j+1; m <j+5&&m<15&&
                            pointers[i][m].getChessPiece().getType()==type; m++) {
                            court++;
                    }
                    for (int n = j-1; n>j-5&&n>-1&&
                            pointers[i][n].getChessPiece().getType()==type; n--) {
                        court++;
                    }
                    if(court>=4){
                        if(type==1){
                            new WinnerDialog("白起");
                        }
                        else{
                            new WinnerDialog("黑骑");
                        }
                        isStart=false;
                        return;
                    }else{court=0;}
                    //判断纵向

                    for (int m = i+1; m <i+5&&m<15&&
                            pointers[m][j].getChessPiece().getType()==type ; m++) {
                        court++;
                    }
                    for (int n = i-1; n>-1&&n>i-5&&
                            pointers[n][j].getChessPiece().getType()==type; n--) {
                        court++;
                    }
                    if(court>=4){
                        if(type==1){
                            new WinnerDialog("白起");
                        }
                        else{
                            new WinnerDialog("黑骑");
                        }
                        isStart=false;
                        return;
                    }else{court=0;}  ;
                    //判断捺
                    for (int m=i-1,n=j-1; m>i-5&&m>-1&&n>j-5&&n>-1&&
                            pointers[m][n].getChessPiece().getType()==type; m--,n--) {
                        court++;
                    }
                    for (int m=i+1,n=j+1; m<i+5&&m<15&&n<15&&n<j+5&&
                            pointers[m][n].getChessPiece().getType()==type; m++,n++) {
                        court++;
                    }
                    if(court>=4){
                        if(type==1){
                            new WinnerDialog("白起");
                        }
                        else{
                            new WinnerDialog("黑骑");
                        }
                        isStart=false;
                        return;
                    }else{court=0;};
                    //判断撇
                    for (int m=i+1,n=j-1; m<i+5&&m<15&&n>j-5&&n>-1&&
                            pointers[m][n].getChessPiece().getType()==type; m++,n--) {
                        court++;
                    }
                    for (int m=i-1,n=j+1; m>i-5&&m>-1&&n<15&&n<j+5&&
                            pointers[m][n].getChessPiece().getType()==type; m--,n++) {
                        court++;
                    }
                    if(court>=4){
                        if(type==1){
                            new WinnerDialog("白起");
                        }
                        else{
                            new WinnerDialog("黑骑");
                        }
                        isStart=false;
                        return;
                    }else{court=0;};
                }
            }
        }
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image,0,0,780,820,this);
        //绘制网格
        drawGird(g);
        //绘制五个小黑点
        drawFivePoints(g);
        //绘制指示器
        drawPointer(g);
        //绘制棋子
        drawChessPiece((Graphics2D) g);

    }

    private void drawFivePoints(Graphics g){
        int x=176;
        int y=76;
        int size=8;
        //左上
        g.fillOval(x,y,size,size);
        //右上
         x=576;
        g.fillOval(x,y,size,size);
        //右下
        y=576;
        g.fillOval(x,y,size,size);
        //左下
        x=176;
        g.fillOval(x,y,size,size);
        //中间
        x=376;
        y=376;
        g.fillOval(x,y,size,size);

    }

    private void drawGird(Graphics g){
        int x1=30;
        int x2=730;
        int y1=30;
        int y2=30;
        //画横线
        for (int i = 0; i <ROWs; i++) {
            g.drawLine(x1,y1,x2,y1);
            y1+=50;
        }
        //画竖线
        for (int j = 0; j <COLs; j++) {
            g.drawLine(x1,y2,x1,730);
            x1+=50;
        }


    }
}
