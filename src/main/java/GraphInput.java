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
