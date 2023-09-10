package day06;

public class Edge {
    public int distance;
    public Node from;
    public Node to;
    public  Edge(int distance,Node from,Node to){
        this.distance=distance;
        this.from=from;
        this.to=to;
    }
}
