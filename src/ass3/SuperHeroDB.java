//Description: Maintains a database of super heroes.
//Author: Collin Gomillia
//Date: 9/29/2022
//
package ass3;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class SuperHeroDB {
    
    public static void main(String[] args)
    {
        
        PrintWriter outStream = null;
        try
        {
            outStream = new
                        PrintWriter(new FileOutputStream("Superheroes.txt"),true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening Superheroes.txt for writing.");
            System.exit(0);
        }
        
        ArrayList<String> SuperHeroes = new ArrayList<String>();
        
        
        
        
        
        
        
        
        
        
        
        
        outStream.close();
    }
}
