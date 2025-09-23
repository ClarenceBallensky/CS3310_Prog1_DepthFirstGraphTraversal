import java.io.*;
import java.util.Stack;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class Prog1
{
    public static void main(String[] args)
    {

        //make sure that the filename is the only command line argument
        if (args.length != 1)
        {
            throw new IllegalArgumentException("Please ONLY provide a file name as a command line argument.");
        }

        //opens up the file specified in the command line
        File file = new File(args[0]);

        //read the contents of the file
        try (Scanner sc = new Scanner(file)){
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();

                GraphInput gi = parseLine(line);
                createAdjList(gi.numVertices, gi.edges);
            }

            sc.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found --> " + args[0]);
        }

    }

    public static GraphInput parseLine(String line)
    {
        //remove whitespace at the start or end of the string, split wherever there are >= 1 whitespace chars
        String[] tokens = line.trim().split("\\s+");

        int numVertices = Integer.parseInt(tokens[0]); //first token is the number of vertices
        List<int[]> edges = new ArrayList<>(); //creates a list where each element is an array of (two) integers

        for (int i = 1; i < tokens.length; i++)
        {
            //for each token, in the format (firstIndex, secondIndex), extract firstIndex and SecondIndex
            String edgeToken = tokens[i].replace("(", "").replace(")", "");
            String[] parts = edgeToken.split(",");
            int firstIndex = Integer.parseInt(parts[0]);
            int secondIndex = Integer.parseInt(parts[1]);

            edges.add(new int[] {firstIndex, secondIndex}); //add each token to edges in the new format [firstIndex, secondIndex]
        }
        return new GraphInput(numVertices, edges);
    }

    public static List<List<Integer>> createAdjList(int numVertices, List<int[]> edges)
    {
        List<List<Integer>> adjList = new ArrayList<>();

        //initialize list of lists
        for (int i = 0; i <= numVertices; i++)
        {
            adjList.add(new ArrayList<>());
        }

        //loop through every edge, formatted [firstIndex, secondIndex], in the edges list
        for (int[] edge : edges)
        {
            int firstIndex = edge[0];
            int secondIndex = edge[1];
            //because the graph is undirected...
            //secondIndex is firstIndex's neighbor
            adjList.get(firstIndex).add(secondIndex);
            //and firstIndex is secondIndex's neighbor
            adjList.get(secondIndex).add(firstIndex);
        }

        return adjList;
    }

}
