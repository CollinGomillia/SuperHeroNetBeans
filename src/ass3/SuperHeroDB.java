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
import java.io.IOException;
import java.util.NoSuchElementException;

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
        
        ArrayList<SuperHero> Heroes = new ArrayList<SuperHero>();
        
        SuperHero flash = new SuperHero("Flash","Speed");
        Heroes.add(flash);
        SuperHero batman = new SuperHero("Batman","Money");
        Heroes.add(batman);
        SuperHero SuperMan = new SuperHero("SuperMan","Strength");
        Heroes.add(SuperMan);
        
        
        for(SuperHero hero: Heroes)
        {
        outStream.println(hero.getName() + " " + hero.getSuperPower() + " " + hero.getIDNum());
        }
        
        outStream.close();
        
        Scanner reader;
        try  {
            FileInputStream sup = new FileInputStream("Superheroes.txt");
            reader  = new Scanner(sup);
           
            while(reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
              
            }
           
            reader.close();
        }catch (NoSuchElementException | IOException e){
            e.printStackTrace();
        }
        
        
        
        
     
        outStream.close();
        
    }
}
