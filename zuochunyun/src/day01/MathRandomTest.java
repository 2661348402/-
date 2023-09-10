package day01;
//测试math.random的种子是固定的还是随机的
//7 5 3 6 6 4 4 7 4 6 6 1 2 4 5 3 1 3 7 8 6 4 3 4 1 5 1 2 4 4
//6 1 7 9 2 9 5 3 2 8 5 9 7 3 6 4 3 1 4 7 9 5 1 9 1 4 7 7 2 9
//将0-1按精度分成等份随机取值，不是固定的
public class MathRandomTest {
    public static void main(String[] args) {
        for (int i = 0; i <30; i++) {
            System.out.print((int)(Math.random()*10)+" ");
        }
    }
}
