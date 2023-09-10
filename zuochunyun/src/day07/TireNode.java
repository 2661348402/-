package day07;
//前缀树的节点
public class TireNode {
    public int pass;
    public int end;
    public TireNode[]nexts;

    public TireNode(){
        pass=0;
        end=0;
        nexts=new TireNode[26];
    }

}
