
# Depth First Search: Graph Traversal
#### Author: Clarence Ballensky

For a given undirected graph, the java program will use Depth-First Traversal to output the number of connected components and the vertices of each connected component.

## Example Input and Output

Input file
```
7 (1,2) (3,4) (3,5) (4,5) 
8 (1,2) (2,3) (3,2) (1,4) (1,5) (6,2) (6,7) (8,2)
12 (1,3) (2,5) (3,4) (3,5) (5,6) (6,7) (8,1) (1,8) (10,12) (9,12) (11,12) (10,9) (11,9)
```

Command line output
```
Graph1:
4 connected component(s): {1,2} {3,4,5} {6} {7}

Graph2:
1 connected component(s): {1,2,3,6,7,8,4,5}

Graph3:
2 connected component(s): {1,3,4,5,2,6,7,8} {9,12,10,11}
```

## How to Run

* Clone the repository from: https://github.com/ClarenceBallensky/CS3310_Prog1_DepthFirstGraphTraversal.git
* Make sure you are using Java JDK 21 (21.0.4 or later)
* Open up the command prompt on your computer
* Switch into the same directory as the .java files by typing "cd <your_directory>" on the command line 
  * For example, I would type "cd C:\Users\prize\IdeaProjects\CS3310_Prog1_DepthFirstGraphTraversal\src\main\java"
* Compile the program by typing "javac Prog1.java" on the command line
* Run the program by typing "java Prog1 <your_input_file.txt>" on the command line
  * Make sure your input file is in the same folder as the .java files
  * To use the provided SampleInput.txt file, type "java Prog1 SampleInput.txt"
