package ArraysTest;
/*请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
    数字 1-9 在每一行只能出现一次。
    数字 1-9 在每一列只能出现一次。
    数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
数独部分空格内已填入了数字，空白格用 '.' 表示。
注意：
    一个有效的数独（部分已被填充）不一定是可解的。
    只需要根据以上规则，验证已经填入的数字是否有效即可。
*/
//方法一：用数组来储存
class Solution10_1 {
    public boolean isValidSudoku(char[][] board) {
        int[][] line=new int[9][9];
        int[][] column=new int[9][9];
        int[][] ceil=new int[9][9];
        for (int i = 0; i <9; i++) {
            for(int j=0;j<9;j++){
                if(board[i][j]!='.') {
                    int num = board[i][j] - '1';
                    int k = i / 3 * 3 + j / 3;
                    if (line[i][num] != 0 || column[num][j] != 0 || ceil[k][num] != 0)
                        return false;
                    line[i][num] = column[num][j] = ceil[k][num] =1;
                }
            }
        }
        return true;
    }
}
//方法二；位运算符储存
class Solution10_2 {
    public boolean isValidSudoku(char[][] board) {
        int[] line=new int[9];
        int[] column=new int[9];
        int[] ceil=new int[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
                int shift=1<<(board[i][j]-'1');
                int k=i/3*3+j/3;
                if((line[i]&shift)!=0||(column[j]&shift)!=0||(ceil[k]&shift)!=0)
                    return false;
                line[i]|=shift;
                column[j]|=shift;
                ceil[k]|=shift;
            }
        }
        return true;
    }
}
