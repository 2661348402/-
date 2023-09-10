public class AI {
    GamePanel1 panel1=null;
    Score score=new Score();
    int x=0;
    int y=0;

    public AI(GamePanel1 panel1) {
        this.panel1 = panel1;
    }

    public int getX() {
        return x;
    }

    public int getY(){return y;}

    private String getPattern(int row,int col,int dir) {
        StringBuffer sb = new StringBuffer();
        if (dir==1) {
            for (int i = col; i < col + 5 && i < 15; i++) {
                int num=panel1.pointers[row][i].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//东
        else if(dir==2){
            for (int i = col; i>col-5&&i>-1; i--) {
                int num=panel1.pointers[row][i].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//西
        else if (dir==3){
            for (int i = row; i <row+5&&i<15; i++) {
                int num=panel1.pointers[i][col].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//南
        else if (dir==4){
            for (int i = row; i>row-5&&i>-1; i--) {
                int num=panel1.pointers[i][col].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//北
        else if (dir==5){
            for (int i = row,j=col;i>row-5&&i>-1&&j>col-5&&j>-1; i--,j--) {
                int num=panel1.pointers[i][j].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//西北
        else if (dir==6){
            for (int i = row,j=col;i<row+5&&i<15&&j>col-5&&j>-1; i++,j--) {
                int num=panel1.pointers[row][col].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//西南
        else if (dir==7){
            for (int i = row,j=col;i<row+5&&i<15&&j<col+5&&j<15; i++,j++) {
                int num=panel1.pointers[i][j].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//东南
        else if (dir==8){
            for (int i = row,j=col;i>row-5&&i>-1&&j<col+5&&j<15; i--,j++) {
                int num=panel1.pointers[i][j].getChessPiece().getType();
                sb.append(num);
            }
            return new String(sb);
        }//东北
         return "00000";
    }

    private int getSumScore(int row,int col){
        int sum=0;
        for (int i = 1; i <9; i++) {
            sum+=score.match(getPattern(row,col,i));
        }
          return sum;
    }

    public int[] nextStep(){
        int []position=new int[2];
        int maxValue=0;
        int score=0;
        for (int i = 0; i <GamePanel1.ROWs; i++) {
            for (int j = 0; j <GamePanel1.COLs; j++) {
                Pointer pointer=panel1.pointers[i][j];
                if(pointer.getChessPiece().getType()==0){
                    score=getSumScore(i,j);
                    if(maxValue<score){
                        maxValue=score;
                      position[0]=i;
                      position[1]=j;
                    }
                }
            }
        }
        return position;
    }

}
