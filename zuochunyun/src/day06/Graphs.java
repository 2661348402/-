package day06;

import java.util.*;

//graph类中·1常用的一些方法；
/*
练习一：宽度优先遍历
练习二：深度优先遍历
练习三：拓扑排序
练习四：kruskal算法求最连通点的最小距离问题
练习五：prim算法求最小连通点问题
练习六：dijkstra算法
 */
public class Graphs {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{1,3,15},{1,4,9},{2,3,2},{3,4,7},{2,5,200},{3,5,14},{4,5,16},};
        int[][]matrix2={{1,2,1},{1,3,1},{1,5,1},{2,3,1},{3,4,1},{3,5,1},{4,5,1}};


        Graph graph=convertToStandard(matrix2);
        Graph graph2=convertToStandard(convertToNoDirection(matrix));
        Node head=graph.nodes.get(1);
        BFS(head);
        System.out.println();
        System.out.println("======================");
        DFS(head);
        System.out.println();
        System.out.println("======================");
        TopologicalSort(graph);
        System.out.println();
        System.out.println("======================");
        System.out.println("???????????????????");
        System.out.println(kruskal(graph2));
        System.out.println("???????????????????");
        System.out.println("???????????????????");
        System.out.println(prim(graph2.nodes.get(1)));
        System.out.println("???????????????????");
        HashMap<Node,Integer> distanceMap=dijkstra(graph2.nodes.get(1));
        System.out.println(distanceMap.get(graph2.nodes.get(2)));
        System.out.println(distanceMap.get(graph2.nodes.get(3)));
        System.out.println(distanceMap.get(graph2.nodes.get(4)));
        System.out.println(distanceMap.get(graph2.nodes.get(5)));
        System.out.println(distanceMap.get(graph2.nodes.get(1)));


    }
    //转化成无图题数组
    public static int[][] convertToNoDirection(int[][] matrix){

        int[][]result=new int[2*matrix.length][3];
        for (int i = 0; i <matrix.length; i++) {
            result[i][0]=matrix[i][0];
            result[i][1]=matrix[i][1];
            result[i][2]=matrix[i][2];
            result[i+ matrix.length][0]=matrix[i][1];
            result[i+ matrix.length][1]=matrix[i][0];
            result[i+matrix.length][2]=matrix[i][2];
        }
        return result;
    }
    //将图转化为标准形式
    public static Graph convertToStandard(int[][]matrix){
        Graph graph=new Graph();
        for (int i = 0; i <matrix.length; i++) {
            int from=matrix[i][0];
            int to=matrix[i][1];
            int distance=matrix[i][2];

            if(!graph.nodes.containsKey(from)){
                graph.nodes.put(from,new Node(from));
            }
            if(!graph.nodes.containsKey(to)){
                graph.nodes.put(to,new Node(to));
            }

            Node fromNode=graph.nodes.get(from);
            Node toNode=graph.nodes.get(to);
            Edge edge=new Edge(distance,fromNode,toNode);

            fromNode.nexts.add(toNode);
            fromNode.out++;
            toNode.in++;
            fromNode.edges.add(edge);
            graph.edges.add(edge);
        }
        return graph;
    }
   //宽度优先遍历
    public static void BFS(Node head){
        Queue<Node> queue=new LinkedList<>();
        HashSet<Node> set=new HashSet();
        queue.add(head);
        set.add(head);
        while(!queue.isEmpty()){
            head=queue.poll();
            System.out.print(head.value+" ");
            for (Node next : head.nexts) {
                if(!set.contains(next)){
                    queue.add(next);
                    set.add(next);
                }
            }
        }
    }
   // 练习二：深度优先遍历
    public static void DFS(Node head){
        Stack<Node> stack=new Stack<>();
        HashSet<Node> set=new HashSet<>();
        stack.push(head);
        set.add(head);
        System.out.print(head.value+" ");
        while(!stack.isEmpty()){
            head=stack.pop();
            for (Node node : head.nexts) {
                if(!set.contains(node)){
                    stack.push(head);
                    stack.push(node);
                    System.out.print(node.value+" ");
                    set.add(node);
                    break;
                }
            }
        }
    }
    //练习三：拓扑排序
    public static void TopologicalSort(Graph graph){
        HashMap<Node,Integer> map=new HashMap<>();
        Queue<Node> queueZero=new LinkedList<>();
        for (Node node : graph.nodes.values()) {
            map.put(node,node.in);
            if(node.in==0){
                queueZero.add(node);
            }
        }
        while(!queueZero.isEmpty()){
            Node node=queueZero.poll();
            System.out.print(node.value+" ");
            for (Node next : node.nexts) {
                next.in--;
                if(next.in==0){
                    queueZero.add(next);
                }
            }
        }
    }
    //练习四：k算法
    public static int  kruskal(Graph graph){
        MySet set=new MySet(graph.nodes.values());
        PriorityQueue<Edge> queue=new PriorityQueue<Edge>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.distance-o2.distance;
            }
        });
        for (Edge edge : graph.edges) {
            queue.add(edge);
        }
        int result=0;
        while (!queue.isEmpty()){
            Edge edge=queue.poll();
            if(!set.isSameList(edge.from,edge.to)){
                System.out.println(edge.from.value+"---"+edge.distance+"---"+edge.to.value);
               result+=edge.distance;
               set.union(edge.from, edge.to);
            }
        }
        return result;
    }
    //练习五：prim算法求最小连通点问题
    public static int prim(Node head){
        PriorityQueue<Edge> edges=new PriorityQueue<Edge>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.distance-o2.distance;
            }
        });
        HashSet<Node> set=new HashSet<>();
        int result=0;
        if (head == null) {
            return 0;
        }
        set.add(head);
        for (Edge edge : head.edges) {
            edges.add(edge);
        }
        while(!edges.isEmpty()){
            Edge edge=edges.poll();
            if(!set.contains(edge.to)){
                set.add(edge.to);
                System.out.println(edge.from.value+"---"+edge.distance+"---"+edge.to.value);
                result+=edge.distance;
                for (Edge edg : edge.to.edges) {
                    edges.add(edg);
                }
            }
        }
        return result;
    }
    //练习六：dijkstra算法求每个点到原点的最小距离
    public static HashMap<Node, Integer> dijkstra(Node head){
        //key=新探索的点，Integer=到起始点的最小距离
        HashMap<Node,Integer> distanceMap=new HashMap<>();
        HashSet<Node> selectedNode=new HashSet<>();
        distanceMap.put(head,0);
        Node minNode=getMinDistanceNode(distanceMap,selectedNode);
        while (minNode!=null){
            int distance=distanceMap.get(minNode);
            for (Edge edge : minNode.edges) {
                Node toNode=edge.to;
                if(!distanceMap.containsKey(toNode)){
                    distanceMap.put(toNode,distance+edge.distance);
                }else{
                    distanceMap.put(toNode, Math.min(distanceMap.get(toNode),distance+edge.distance));
                }
            }
            selectedNode.add(minNode);
            minNode=getMinDistanceNode(distanceMap,selectedNode);
        }
        return distanceMap;

    }
    public static Node getMinDistanceNode(HashMap<Node,Integer> distanceMap,HashSet<Node> touchNode){
       Set<Map.Entry<Node, Integer>> entryS=distanceMap.entrySet();
        Node minNode=null;
        int minDistance=Integer.MAX_VALUE;
        for (Map.Entry<Node, Integer> entry : entryS) {
            Node node=entry.getKey();
            int distance=entry.getValue();
            if((!touchNode.contains(node))&&distance<minDistance){
                minNode=node;
                minDistance=distance;
            }
        }
            return minNode;
    }
}
