//Description: Maintains a database of super heroes.
//Author: Collin Gomillia
//Date: 9/29/2022
//Received clues from Tutoring center
//
package ass3;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException; 

public class SuperHeroDB {
    
    public static void main(String[] args)
    {
        //Opening our txt file for writing
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
        //Array List of SuperHeroes
        ArrayList<SuperHero> Heroes = new ArrayList<SuperHero>();
        
        SuperHero flash = new SuperHero("Flash","Speed"); //Created a object superhero that will be printed
        Heroes.add(flash);//Adds it to our database
        SuperHero batman = new SuperHero("Batman","Money");//Created a object superhero that will be printed
        Heroes.add(batman);//Adds it to our database
        SuperHero SuperMan = new SuperHero("SuperMan","Strength");//Created a object superhero that will be printed
        Heroes.add(SuperMan);//Adds it to our database
        
        
        for(SuperHero hero: Heroes) //For loop is getting descriptions of the heroes, then writing each hero line by line
        {
        outStream.println(hero.getName() + " " + hero.getSuperPower() + " " + hero.getIDNum());
        }
        //Close file
        outStream.close();
        
        Scanner reader; //reader to test for errors
        try  { //Try statement is checking for errors while the program is being executed
            FileInputStream sup = new FileInputStream("Superheroes.txt"); //The statement will read the data from the file
            reader  = new Scanner(sup); //Reading input from FileInputStream
           
            while(reader.hasNext()){ //While the scanner has another object in its input, the loop will stay true
                String line = reader.nextLine(); //Taking input from reader
                System.out.println(line);//Displaying contents
              
            }
           
            reader.close();//Closes reader
        }catch (NoSuchElementException | IOException e){ //Catch statement receieves any errors in the try block
            e.printStackTrace();//printStackTrace will tell us where any exceptions occur
        }
        //Closes file
        outStream.close();
        
    }
}
