package graphdns;

import java.util.*;

class ChinesePostman {
    private int V; // Number of vertices (houses/intersections)
    private Map<Integer, List<Integer>> graph = new HashMap<>(); // Adjacency list

    public ChinesePostman(int vertices) {
        this.V = vertices;
        for (int i = 0; i < vertices; i++) {
            graph.put(i, new ArrayList<>());
        }
    }

    // Add an edge (street) between two houses
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // Since it's an undirected graph
    }

    // Find odd-degree vertices
    private List<Integer> getOddDegreeVertices() {
        List<Integer> oddVertices = new ArrayList<>();
        for (int node : graph.keySet()) {
            if (graph.get(node).size() % 2 != 0) {
                oddVertices.add(node);
            }
        }
        return oddVertices;
    }

    // Make graph Eulerian by adding duplicate edges for odd-degree vertices
    public void makeEulerian() {
        List<Integer> oddVertices = getOddDegreeVertices();
        while (oddVertices.size() > 1) {
            int u = oddVertices.remove(0);
            int v = oddVertices.remove(0);
            addEdge(u, v);
            System.out.println("Adding extra street between house " + u + " and house " + v);
        }
    }

    // Find Eulerian Circuit using Hierholzer's Algorithm
    public void findEulerianCircuit(int start) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> circuit = new ArrayList<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int current = stack.peek();
            if (!graph.get(current).isEmpty()) {
                int next = graph.get(current).remove(0); // Remove edge
                graph.get(next).remove((Integer) current); // Remove reverse edge
                stack.push(next);
            } else {
                circuit.add(stack.pop());
            }
        }

        System.out.println("Postman's optimal delivery route: " + circuit);
    }

    public static void main(String[] args) {
        ChinesePostman cpp = new ChinesePostman(5);

        // Adding streets between houses
        cpp.addEdge(0, 1);
        cpp.addEdge(1, 2);
        cpp.addEdge(2, 3);
        cpp.addEdge(3, 4);
        cpp.addEdge(4, 0);
        cpp.addEdge(1, 3);

        // Check and adjust for Eulerian properties
        cpp.makeEulerian();

        // Find and print Eulerian circuit
        cpp.findEulerianCircuit(0);
    }
}
