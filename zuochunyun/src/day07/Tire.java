package day07;
//前缀树
public class Tire {
    private static TireNode root=new TireNode();




    public static void main(String[]args){
        insert("abc");
        insert("abandon");
        insert("abc");
        insert("def");
        System.out.println(search("abc"));
        System.out.println(search("ggb"));
        System.out.println("prefixNumber:"+prefixNumber("ab"));
        delete("abc");
        System.out.println("prefixNumber:"+prefixNumber("ab"));

    }
    public static void insert(String str){
        if(str==null){
            return;
        }
        char[] chars=str.toCharArray();
        TireNode node=root;
        node.pass++;
        int index=0;
        for (int i = 0; i <chars.length; i++) {
            //选择走一条路
            index=chars[i]-'a';
            if(node.nexts[index]==null){
                node.nexts[index]=new TireNode();
            }
            node=node.nexts[index];
            node.pass++;
        }
        node.end++;

    }
    public static int search(String str){
        if (str == null) {
            return 0;
        }
        char[] chs=str.toCharArray();
        TireNode node=root;
        int index=0;
        for (int i = 0; i <chs.length; i++) {
            index= chs[i]-'a';
            if(node.nexts[index]==null){
                return 0;
            }
            node=node.nexts[index];
        }
            return node.end;
    }
    public static void delete(String str){
        if(search(str)!=0){
            char[]chs=str.toCharArray();
            TireNode node=root;
            node.pass--;
            int index=0;
            for (int i = 0; i <chs.length; i++) {
                index=chs[i]-'a';
                if(--node.nexts[index].pass==0){
                    node.nexts[index]=null;
                    return;
                }
                node=node.nexts[index];
            }
            node.end--;
        }
    }
    public static int prefixNumber(String prefix){
        if(prefix==null){
            return 0;
        }
        char[]chs=prefix.toCharArray();
        TireNode node=root;
        int index=0;
        for (int i = 0; i <chs.length; i++) {
            index=chs[i]-'a';
            if(node.nexts[index]==null){
                return 0;
            }
            node=node.nexts[index];
        }
        return node.pass;
    }



}
