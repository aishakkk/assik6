public class Main {
    public static void main(String[] args) {
        // Create a weighted graph
        WeightedGraph<String> graph = new WeightedGraph<>();

        // Create vertices
        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");
        Vertex<String> vertexD = new Vertex<>("D");

        // Add vertices to the graph
        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);

        // Add edges with weights
        graph.addEdge(vertexA, vertexB, 1.0);
        graph.addEdge(vertexB, vertexC, 2.0);
        graph.addEdge(vertexC, vertexD, 3.0);

        // Perform a breadth-first search
        Search<String> bfs = new BreadthFirstSearch<>();
        System.out.println("BFS traversal: " + bfs.search(graph, vertexA));

        // Perform Dijkstra's algorithm
        Search<String> dijkstra = new DijkstraSearch<>();
        System.out.println("Dijkstra's shortest path: " + dijkstra.search(graph, vertexA));
    }
}