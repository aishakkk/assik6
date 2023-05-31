import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Breadth-first search algorithm implementation for a weighted graph.
 *
 * @param <V> the type of data stored in the vertices of the graph.
 */

public class BreadthFirstSearch<V> implements Search<V> {
    @Override
    public List<Vertex<V>> search(WeightedGraph<V> graph, Vertex<V> startVertex) {
        List<Vertex<V>> visited = new ArrayList<>();
        Queue<Vertex<V>> queue = new LinkedList<>();

        queue.offer(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex<V> currentVertex = queue.poll();

            List<Vertex<V>> adjacentVertices = graph.getAdjacentVertices(currentVertex);
            for (Vertex<V> adjacentVertex : adjacentVertices) {
                if (!visited.contains(adjacentVertex)) {
                    queue.offer(adjacentVertex);
                    visited.add(adjacentVertex);
                }
            }
        }

        return visited;
    }
}