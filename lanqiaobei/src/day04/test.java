package day04;

public class test {
    public static void main(String[] args) {
        int temp=5;
        for (int i = 0; i <10; i++) {
            int j=i;
            while(j++<temp){
                if(j==3){
                    continue;
                }
                System.out.println("while"+j);
            }
            System.out.println("for"+i);
        }
    }
}
