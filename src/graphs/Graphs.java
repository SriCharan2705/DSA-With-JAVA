package graphs;
import java.util.ArrayList;
import java.util.HashMap;
//////////////////// 72.Graph: add vertex  ///////////////////////////////
public class Graphs {
    private HashMap<String,ArrayList<String>>adjList=new HashMap<>();

    public void printGraph(){
        System.out.println(adjList);
    }
    public boolean addVertex(String vertex){
        if (adjList.get(vertex)==null){
            adjList.put(vertex,new ArrayList<String>());
            return true;
        }
        return false;
    }
//////////////////////  73. add edge /////////////////////////
    public boolean addEdge(String vertex1,String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    ///////////////////74. remove edge ////////////////////
    public boolean removeEdge(String vertex1,String vertex2){
        if (adjList.get(vertex1)!=null && adjList.get(vertex2)!=null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }return false;
    }
    /////////////// 75.remove vertex ////////////////////////
    public boolean removeVertex(String vertex){
        if(adjList.get(vertex)== null) return false;
        for(String otherVertex :adjList.get(vertex)){
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
