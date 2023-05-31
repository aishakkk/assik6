assignment 6 
Graph Algorithms with Weighted Graphs - README

This project presents an implementation of breadth-first search (BFS) and Dijkstra's algorithm for a weighted graph using vertices.

Project Structure
The project is structured as follows:

Vertex: Represents a vertex within a weighted graph.
WeightedGraph: Represents a weighted graph that includes vertices.
Search: An interface for graph search algorithms.
BreadthFirstSearch: Implements BFS for a weighted graph.
DijkstraSearch: Implements Dijkstra's algorithm for a weighted graph.
Main: Provides an example usage of the implemented algorithms.

Usage
To utilize this project, follow these steps:

Clone the project from the GitHub repository.
Open the project using IntelliJ IDEA.
Run the Main class to observe the example usage of BFS and Dijkstra's algorithm on a weighted graph.
Adjust the code in Main or other classes according to your specific requirements.

Additional Notes
The Vertex class signifies a vertex in a weighted graph and stores its associated data. It also maintains a map of neighboring vertices along with their corresponding weights.
The WeightedGraph class represents a weighted graph and offers methods to add vertices, add edges with weights, and retrieve neighboring vertices.
The BreadthFirstSearch class implements BFS for a weighted graph, performing a breadth-first traversal starting from a given vertex.
The DijkstraSearch class implements Dijkstra's algorithm for a weighted graph, finding the shortest path from a given vertex to all other vertices.
The Main class demonstrates the usage of the implemented algorithms on a sample weighted graph.
Feel free to explore and modify the code to suit your specific needs.
