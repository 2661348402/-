package day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class MySet {
    HashMap<Node, Collection<Node>> setMap=new HashMap<>();
   public MySet(Collection<Node> nodes){
       for (Node node : nodes) {
           Collection<Node> list = new LinkedList<>();
           list.add(node);
           setMap.put(node, list);
       }
   }

    public boolean isSameList(Node from, Node to){
       return setMap.get(from)==setMap.get(to);
   }
   public void union(Node from, Node to){
       Collection<Node> list=setMap.get(from);
       for (Node node: setMap.get(to)) {
           list.add(node);
           setMap.put(node,list);
       }
   }
}
