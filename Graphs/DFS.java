import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public int V;
  
    public LinkedList<Integer> adj[];

    public Main(int V)
    {
        this.V = V;

        adj = new LinkedList[V+1];
        for(int i = 1; i < V+1; i++)
        {
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w)
    {
        // add w to v’s list.
        adj[v].add(w);
        // add v to w's list.
        adj[w].add(v);
    }
    void DFSUtil(int v, boolean []visited)
    {
        
        // Mark the current node as visited and
        // print it
        visited[v] = true;
        
        // Recur for all the vertices adjacent
        // to this vertex
         Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
   
// Returns count of not reachable nodes from
// vertex v.
// It uses recursive DFSUtil()
    int countNotReach(int v)
    {
        
        // Mark all the vertices as not visited
        boolean []visited = new boolean[V];
        
        for(int i = 0; i < V; i++)
            visited[i] = false;
    
        // Call the recursive helper function
        // to print DFS traversal
        DFSUtil(v, visited);
    
        // Return count of not visited nodes
        int count = 0;
        for(int i = 0; i < V; i++)
        {
            if (visited[i] == false)
                count++;
        }
        return count;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        
        Main m = new Main(v);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            m.addEdge(sc.nextInt(),sc.nextInt());
        }
        System.out.print(m.countNotReach(sc.nextInt()));
    }
}