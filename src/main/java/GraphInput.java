/**
 * Clarence Ballensky
 * CS 3310.01, Fall 2025
 * Programming Assignment 1
 * GraphInput.java is a helper class to manage numVertices and edges
 */

import java.util.List;

public class GraphInput
{
    int numVertices;
    List<int[]> edges;

    GraphInput(int numVertices, List<int[]> edges)
    {
        this.numVertices = numVertices;
        this.edges = edges;
    }
}
