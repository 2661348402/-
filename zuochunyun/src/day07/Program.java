package day07;

public class Program implements Comparable{
    public  int start;
    public  int end;

    public Program(){
    }
    public Program(int start,int end){
        this.start=start;
        this.end=end;
    }

    public  int getStart() {
        return start;
    }

    public  void setStart(int start) {
        this.start = start;
    }

    public  int getEnd() {
        return end;
    }

    public  void setEnd(int end) {
        this.end = end;
    }


    @Override
    public int compareTo(Object o) {
        Program p=(Program) o;
        return end-p.end;
    }
}
