import java.awt.*;

public class Pointer {
    private int i;
    private int j;
    private int x;
    private int y;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    public static final int H =50;
    private boolean states=false;
    private ChessPiece chessPiece;
    Pointer(int i,int j,int x,int y){
        this.i=i;
        this.j=j;
        this.x=x;
        this.y=y;
        x1=x-H/2;
        x2=x+H/2;
        y1=y-H/2;
        y2=y+H/2;
    }

    public int getX() {
        return x;
    }

   public int getY(){return y;}

    public boolean isStates() {
        return states;
    }

    public void setStates(boolean states) {
        this.states = states;
    }

    public boolean  isPoint(int x, int y){
        if(x<x2&&y<y2&&x>x1&&y>y1){
           return true;
        }
        return false;
    }

    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void draw(Graphics g){
       // g.drawRect(x- H /2,y- H /2, H, H);
        Graphics2D g2=(Graphics2D) g;
        ((Graphics2D) g).setStroke(new BasicStroke(2.0f));
        g2.setColor(Color.red);
        //绘制指示器
        int x1,y1,x2,y2;
        //绘制左上角
        //横线
        x1=this.x1;
        x2=x1+H/4;
        y1=this.y1;
        y2=y1;
       g2.drawLine(x1,y1,x2,y2);
       //竖线
        x1=this.x1;
        x2=x1;
        y1=this.y1;
        y2=y1+H/4;
        g2.drawLine(x1,y1,x2,y2);
        //绘制右上角
        //横线
        x1=this.x1+H;
        x2=x1-H/4;
        y1=this.y1;
        y2=y1;
        g2.drawLine(x1,y1,x2,y2);
        //竖线
        x1=this.x1+H;
        x2=x1;
        y1=this.y1;
        y2=y1+H/4;
        g2.drawLine(x1,y1,x2,y2);

        //绘制左下角
        //横线
        x1=this.x1;
        x2=x1+H/4;
        y1=this.y1+H;
        y2=y1;
        g2.drawLine(x1,y1,x2,y2);
        //竖线
        x1=this.x1;
        x2=x1;
        y1=this.y1+H;
        y2=y1-H/4;
        g2.drawLine(x1,y1,x2,y2);
        //绘制右下角
        //横线
        x1=this.x2;
        x2=x1-H/4;
        y1=this.y2;
        y2=y1;
        g2.drawLine(x1,y1,x2,y2);
        //竖线
        x1=this.x2;
        x2=x1;
        y1=this.y2;
        y2=y1-H/4;
        g2.drawLine(x1,y1,x2,y2);



    }
}
