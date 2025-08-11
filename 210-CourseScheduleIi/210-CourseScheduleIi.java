// Last updated: 12/08/2025, 00:19:08
class Solution {
    static List<Integer> ll;
    class Graph {
        Map<Integer, List<Integer>> adjList;
        int numV;

        public Graph(int numV) {
            adjList = new HashMap<>();
            this.numV = numV;
        }

        private void Addedge(int u, int v) {
            List<Integer> uNeighbour = this.adjList.getOrDefault(u, new ArrayList<>());
            uNeighbour.add(v);
            this.adjList.put(u, uNeighbour);
        }
        private int[] indegree() {
            int[] indegree = new int[numV];

            for (List<Integer> Neighbour : this.adjList.values()) {
                for (int i : Neighbour) {
                    indegree[i]++;
                }
            }
            return indegree;
        }

        public boolean topologicalSort() {
            int course=0;
            Queue<Integer> bfs = new LinkedList<>();
            int[] degree = indegree();
            for (int i = 0; i < numV; i++) {
                if (degree[i] == 0){
                    bfs.add(i);
                    ll.add(i);
                    course++;
                }
            }
            while (!bfs.isEmpty()) {
                int front = bfs.poll();
                List<Integer> neighbour = this.adjList.getOrDefault(front, new ArrayList<>());
                for (int i : neighbour) {
                    degree[i]--;
                    if (degree[i] == 0) {
                        bfs.add(i);
                        ll.add(i);
                        course++;
                    }
                }
            }
            return course==numV;
        }
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ll=new ArrayList<>();
        Graph g=new Graph(numCourses);
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][1];
            int v=prerequisites[i][0];
            g.Addedge(u,v);
        }
        boolean ans=g.topologicalSort();
        if(!ans) return new int[0];
        int[] arr=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}