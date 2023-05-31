import java.util.List;
/**
 * Represents a search algorithm for a weighted graph.
 *
 * @param <V> the type of data stored in the vertices of the graph.
 */

public interface Search<V> {

    /**
     * Performs a search on the given weighted graph starting from the specified vertex.
     *
     * @param graph       the weighted graph to be searched.
     * @param startVertex the starting vertex for the search.
     * @return a list of vertices visited during the search.
     */
    List<Vertex<V>> search(WeightedGraph<V> graph, Vertex<V> startVertex);
}