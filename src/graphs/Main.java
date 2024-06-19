package graphs;

public class Main {
    public static void main (String[]args){
        Graphs myGraph= new Graphs();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.removeEdge("A","C");
        myGraph.removeVertex("C");
        myGraph.printGraph();

    }
}
