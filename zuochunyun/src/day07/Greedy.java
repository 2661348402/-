package day07;

/*
贪心算法
一：解题套路
先写出一种标准解（确保是绝对正确的，可以是暴力破解）
用不同的标准想出贪心算法a,b,c等解法
用标准解和对数器去验证哪个贪心算法正确
常用技巧：
根据某一标准构建一个比较器来排序
根据某一标准构建一个比较器来组成堆。
练习一：一些项目要占用一个会议室宣讲，会议室不能同时容纳两个项目的宣讲，
        给你每一个项目开始的时间和结束的时间，你来安排日程，要求会议室的宣讲次数最多，
        返回这个最多宣讲的次数。
练习二：看项目图片
练习三：最大利润：
练习四：N皇后问题是指在N*N的棋盘上，要摆N个皇后，要求
任意两个皇后不同行不同列，也不再同一斜线上，
给定一个整数N，返回N皇后的摆法有多少种。
列如：
N=1,返回1
N=2或3，无解返回0
N=8，返回92。

 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Greedy {
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
        System.out.println(bestArrange(programs,6));

        int[] arr={10,20,30};
        System.out.println(lessMoney(arr));

        int[]costs={1,1,2,2,3,4};
        int[]profits={1,4,3,7,2,10};
        int m=1;
        int k=4;
        System.out.println(maxProfit(k,m,costs,profits));
        long startTime=System.currentTimeMillis();
        System.out.println(NQueens(15));
        System.out.println("time:"+(System.currentTimeMillis()-startTime));
        long startTime1=System.currentTimeMillis();
        System.out.println(NQueens2(15));
        System.out.println("time:"+(System.currentTimeMillis()-startTime1));

    }
    //练习一：安排日程
    public static int  bestArrange(Program[] programs,int timePoint){
        int result=0;
        Arrays.sort(programs);
        for (int i = 0; i <programs.length; i++) {
            if(timePoint<=programs[i].start){
                result++;
                timePoint=programs[i].end;
            }
        }
        return result;
    }
    //练习二：金条分配
    public static int lessMoney(int[] arr){
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int i : arr) {
            heap.add(i);
        }
        int result=0;
        int temp=0;
        while(heap.size()!=1){
            temp=heap.poll()+heap.poll();
            result+=temp;
            heap.add(temp);
        }
        return result;
    }
    //练习三：最大利润
    static class Node{
        public int p;
        public int c;
        public Node(int c,int p){
            this.p=p;
            this.c=c;
        }
    }
    public static int maxProfit(int k,int w,int[]costs,int[]profits){
      PriorityQueue<Node> minCosts=new PriorityQueue<>(new Comparator<Node>() {
          @Override
          public int compare(Node o1, Node o2) {
              return o1.c-o2.c;
          }
      });
      PriorityQueue<Node> maxProfits=new PriorityQueue<>(new Comparator<Node>() {
          @Override
          public int compare(Node o1, Node o2) {
              return o2.p-o1.p;
          }
      });
        for (int i = 0; i <costs.length; i++) {
            minCosts.add(new Node(costs[i],profits[i]));
        }
        for (int j = 0; j<k;j++) {
            while (!minCosts.isEmpty()&&minCosts.peek().c<=w){
                maxProfits.add(minCosts.poll());
            }
            if(maxProfits.isEmpty()){
                return w;
            }
            w+=maxProfits.poll().p;
            }
        return w;
        }
        //练习四：N皇后问题
    public static int  NQueens(int n){
        if(n<1){
            return 0;
        }
        int[] records=new int[n];
        return process(0,records,n);
    }
    public static int process(int i,int[]records,int n){
        if(i==n){
            return 1;
        }
        int res=0;
        for (int j = 0; j <n; j++) {
            if(isValid(i,j,records)){
                records[i]=j;
                res+=process(i+1,records,n);
            }
        }
        return res;
    }
    public static boolean isValid(int i,int j,int[] records){

        for (int k = 0; k <i; k++) {
                if(records[k]==j||(Math.abs(k-i)== Math.abs(records[k]-j))){
                    return false;
                }
        }
        return true;
    }
    public static int NQueens2(int n){
        if(n<1||n>32){
            return 0;
        }
        int limit=n==32?-1:(1<<n)-1;
        return process2(limit,0,0,0);
    }
    public static int process2(int limit,int column,int rightDiaLim,int leftDiaLim){
        if(column==limit){
            return 1;
        }
        int pos=limit&~(column|rightDiaLim|leftDiaLim);
        int rightOne=0;
        int res=0;
        while(pos!=0){
            rightOne=pos&((~pos)+1);
            pos-=rightOne;
            res+=process2(limit,column|rightOne,
                    (rightDiaLim|rightOne)>>>1,
                    (leftDiaLim|rightOne)<<1);
        }
            return res;
    }
    }

