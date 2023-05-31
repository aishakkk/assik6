import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Represents a weighted graph.
 *
 * @param <V> the type of data stored in the vertices of the graph.
 */

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Vertex<V>>> map;
    private Vertex<V>[] vertices;


    /**
     * Creates a new weighted graph.
     */

    public WeightedGraph() {
        this.map = new HashMap<>();
    }
    /**
     * Adds a vertex to the graph.
     *
     * @param vertex the vertex to be added.
     */
    public void addVertex(Vertex<V> vertex) {
        map.put(vertex, new ArrayList<>());
    }
    /**
     * Adds an edge between two vertices with the specified weight.
     *
     * @param source      the source vertex of the edge.
     * @param destination the destination vertex of the edge.
     * @param weight      the weight of the edge.
     */

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        source.addAdjacentVertex(destination, weight);
        destination.addAdjacentVertex(source, weight);
    }

    /**
     * Returns a list of adjacent vertices for a given vertex.
     *
     * @param vertex the vertex to retrieve the adjacent vertices for.
     * @return the list of adjacent vertices.
     */

    public List<Vertex<V>> getAdjacentVertices(Vertex<V> vertex) {
        return map.get(vertex);
    }

    public Vertex<V>[] getVertices() {
        return vertices;
    }
    /**
     * Returns a list of all vertices in the graph.
     *
     * @return the list of vertices.
     */
}