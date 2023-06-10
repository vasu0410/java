import java.util.*;
public class Graph {
    private LinkedList<Integer> adj[];

    public Graph(int V){
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }   
    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    public int BFS(int source,int desti){
        boolean visit[] = new boolean[adj.length];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(source);
        visit[source]=true;
        int distance = 0;

        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr==desti) break;

            for(int neighbor:adj[curr]){
                if(!visit[neighbor]){
                    visit[neighbor]=true;
                    q.add(neighbor);
                    distance++;
                }
            }
        }
        return distance;
    }
    private boolean DFS(int source,int desti){
        boolean visit[] = new boolean[adj.length];

        visit[source] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while(!stack.isEmpty()){
            int curr = stack.pop();
            if(curr==desti) return true;

            for(int neighbor : adj[curr]){
                if(!visit[neighbor]){
                    visit[neighbor]=true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        Graph graph = new Graph(n);
        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }
        System.out.println("Enter Soruce and destination");
        int source = sc.nextInt();
        int desti = sc.nextInt();
        
        System.out.println(graph.BFS(source, desti));
        System.out.println(graph.DFS(source, desti));
    }
}
