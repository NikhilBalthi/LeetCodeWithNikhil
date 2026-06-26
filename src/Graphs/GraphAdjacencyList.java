package Graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {

    // Function to add an edge into an undirected graph
    public static void addEdge(List<List<Integer>> adjList, int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Remove this line for a directed graph
    }

    // Function to print the adjacency list representation of the graph
    public static void printGraph(List<List<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + " is connected to: ");

            // Loop through all neighbors of the current vertex
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5; // Total number of nodes (0 to 4)

        // Initialize the outer container list
        List<List<Integer>> adjList = new ArrayList<>(vertices);

        // Initialize an empty inner list for each vertex to prevent NullPointerException
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Define graph edges
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);

        // Print the final layout
        printGraph(adjList);
    }
}

