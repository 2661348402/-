package 算法训练;
//数字游戏
//需要用到全排列的思想（深度优先遍历）
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        test3 t3=new test3();
        t3.n = n;
        t3.sum = sum;
        t3.arr = new int[n];
        t3.visit = new boolean[n + 1];
        t3.dfs(0);
    }

    static class test3 {
        int n, sum;
        boolean[] visit;
        int[] arr;

        public void dfs(int step) {
            if (step == n) {
                if (isSum()) {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.exit(0);
                }
            } else {
                for (int i = 1; i < arr.length+1; i++) {
                    if (!visit[i]) {
                        arr[step] = i;
                        visit[i] = true;
                        dfs(step + 1);
                        visit[i] = false;
                    }
                }
            }
        }

        public boolean isSum() {
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            int j = arr2.length-1;
            while (j > 0) {
                for (int i = 0; i < j; i++) {
                    arr2[i] = arr2[i] + arr2[i + 1];
                }
                j--;
            }
            return arr2[0] == sum;
        }
    }
}
