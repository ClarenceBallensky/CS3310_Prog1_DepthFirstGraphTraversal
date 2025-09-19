package edu.cpp;

import java.io.*;

public class Prog1
{
    public static void main(String[] args)
    {

        //make sure that the filename is the only command line argument
        if (args.length != 1)
        {
            throw new IllegalArgumentException("Please ONLY provide a file name as a command line argument.");
        }

        //retrieve filename
        String filename = args[0];

        //open up the file and read the contents
        File file = new File(filename);

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            int ch;

            while ((ch = br.read()) != -1) //-1 means end of file
            {
                char character = (char) ch;
                System.out.print(character);
            }

        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }


    }
}
