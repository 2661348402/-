package ArraysTest;

/*给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
示例 1：
输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[[7,4,1],[8,5,2],[9,6,3]]
*/
class Solution11_1 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int x=0;
        int y=0;
        int courtX=0;
        int courtY=0;
        int temp=matrix[x][y];
        for(int i=0;i<n*n;i++) {
           int t=matrix[y][n-1-x];
            matrix[y][n-1-x]=temp;
            temp=t;
            t=x;
            x=y;
            y=n-1-t;
            if(x==courtX&&y==courtY){
                if(courtX<n-1);
            }


        }
    }
}
