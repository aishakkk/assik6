import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Vertex<V>>> map;
    private Vertex<V>[] vertices;

    public WeightedGraph() {
        this.map = new HashMap<>();
    }

    public void addVertex(Vertex<V> vertex) {
        map.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        source.addAdjacentVertex(destination, weight);
        destination.addAdjacentVertex(source, weight);
    }

    public List<Vertex<V>> getAdjacentVertices(Vertex<V> vertex) {
        return map.get(vertex);
    }

    public Vertex<V>[] getVertices() {
        return vertices;
    }
}