import java.util.LinkedList;
public class Graph {

    private int numVertices;
    LinkedList<Integer>[] adjacencyList;
    Graph(int n){
        numVertices = n;
        adjacencyList = new LinkedList[numVertices];
        for(int i=0;i<numVertices;i++)
            adjacencyList[i] = new LinkedList<Integer>();

    }

    void addEdge(Integer src, Integer des){
        this.adjacencyList[src].add(des);
    }
    void printGraph(){
        for(int i=0; i<this.numVertices;i++){
            //System.out.println("Adjacency list of vertex : " +i);
            System.out.print(""+i+" : ");
            int j=0;
            for(; j<this.adjacencyList[i].size()-1;j++){
                System.out.print(this.adjacencyList[i].get(j));
                System.out.print(" --> ");
            }
            if(j==adjacencyList[i].size()-1)
                System.out.println(this.adjacencyList[i].get(j));
            else System.out.println();
        }
    }
    public static Integer[][] generateAdjMatrix(Graph g){
        //creates new integer array for adjacency matrix
        Integer[][] adjacencyMatrix = new Integer[g.numVertices][g.numVertices];
        //for loop that fills the adjacency matrix
        for (int i=0; i<adjacencyMatrix.length; i++){
            for (int j=0; j<adjacencyMatrix[i].length; j++){
                adjacencyMatrix[i][j]=0;
            }
        }

        for (int i = 0; i<g.numVertices; i++) {
            for (int j =0; j<g.adjacencyList[i].size();j++){
                adjacencyMatrix[i][g.adjacencyList[i].get(j)]=1;
            }

        }
        //returns complete matrix
        return adjacencyMatrix;
    }
    public static void printMatrix(Integer[][] adjMatrix){
        //for loop that iterates thru the matrix and prints it
        for (int i =0;i<adjMatrix.length;i++){
            for (int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create a graph of 5 vertices
        Graph g2 = new Graph(5);
        g2.addEdge(0, 1);
        g2.addEdge(0, 4);
        g2.addEdge(0, 3);
        g2.addEdge(2, 0);
        g2.addEdge(3, 2);
        g2.addEdge(4, 3);
        g2.addEdge(4, 1);
        g2.printGraph();

        Integer[][] adjMatrix = generateAdjMatrix(g2);
        printMatrix(adjMatrix);
/* Should print the following Matrix

01011
00000
10000
00100
01010

*/

    }
}