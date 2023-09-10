package day07;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
       Program[] programs=new Program[6];
       Program p1=new Program(6,8);
       Program p2=new Program(6,7);
       Program p3=new Program(7,9);
       Program p4=new Program(8,11);
       Program p5=new Program(9,10);
       Program p6=new Program(11,15);
       int i=0;
       programs[i++]=p1;
       programs[i++]=p3;
       programs[i++]=p6;
       programs[i++]=p2;
       programs[i++]=p5;
       programs[i++]=p4;

       Arrays.sort(programs);
       System.out.println("+++++++++++++++++++++++++");
       for (Program program : programs) {
          System.out.println(program.end);
       }
    }

}
