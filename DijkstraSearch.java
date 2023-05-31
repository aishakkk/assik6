import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Dijkstra's algorithm implementation for finding the shortest path in a weighted graph.
 *
 * @param <V> the type of data stored in the vertices of the graph.
 */

public class DijkstraSearch<V> implements Search<V> {
    @Override
    public List<Vertex<V>> search(WeightedGraph<V> graph, Vertex<V> startVertex) {
        List<Vertex<V>> visited = new ArrayList<>();
        PriorityQueue<Vertex<V>> queue = new PriorityQueue<>(Comparator.comparingDouble(v -> getDistance(v, startVertex)));
        Map<Vertex<V>, Double> distances = new HashMap<>();
        Map<Vertex<V>, Vertex<V>> previousVertices = new HashMap<>();

        for (Vertex<V> vertex : graph.getVertices()) {
            if (vertex == startVertex) {
                distances.put(vertex, 0.0);
            } else {
                distances.put(vertex, Double.POSITIVE_INFINITY);
            }
            previousVertices.put(vertex, null);
            queue.offer(vertex);
        }

        while (!queue.isEmpty()) {
            Vertex<V> currentVertex = queue.poll();
            visited.add(currentVertex);

            List<Vertex<V>> adjacentVertices = graph.getAdjacentVertices(currentVertex);
            for (Vertex<V> adjacentVertex : adjacentVertices) {
                double distance = distances.get(currentVertex) + getWeight(currentVertex, adjacentVertex);
                if (distance < distances.get(adjacentVertex)) {
                    distances.put(adjacentVertex, distance);
                    previousVertices.put(adjacentVertex, currentVertex);
                    queue.remove(adjacentVertex);
                    queue.offer(adjacentVertex);
                }
            }
        }

        return visited;
    }

    // Helper methods for distance calculation and weight retrieval

    /**
     * Calculates the distance between two vertices.
     *
     * @param vertex       the vertex to calculate the distance for.
     * @param startVertex  the starting vertex for the distance calculation.
     * @return the distance between the vertices.
     */
    private double getDistance(Vertex<V> vertex, Vertex<V> startVertex) {
        // Implement your distance calculation logic here
        return 0.0;
    }
    /**
     * Retrieves the weight of the edge between two vertices.
     *
     * @param source      the source vertex of the edge.
     * @param destination the destination vertex of the edge.
     * @return the weight of the edge.
     */

    private double getWeight(Vertex<V> source, Vertex<V> destination) {
        // Implement your weight retrieval logic here
        return 0.0;
    }
}