//SuperHero test Class
package ass3;

import java.util.Scanner;
public class Ass3 {

    
    public static void main(String[] args) {
       
        
       Scanner Input = new Scanner(System.in);
       
        System.out.println("Who is your superhero?");//User input for super hero name
        String hero = Input.next();
        
        System.out.println("What is their power?");//User input for super power
        String power = Input.next();
        
        SuperHero myHero = new SuperHero(hero,power);//New object to create super hero
        System.out.printf("Hero name: %s%n   Power: %s%n   ID: %d%n",myHero.getName(), myHero.getSuperPower(), myHero.idNum);//Displaying description of hero
       //Repeating below to test counter and ID 
        System.out.println("Who is your superhero?");
        hero = Input.next();
        
        System.out.println("What is their power?");
        power = Input.next();
        
        SuperHero myHero1 = new SuperHero(hero,power);
        System.out.printf("Hero name: %s%n Power: %s%n ID: %d%n",myHero1.getName(), myHero1.getSuperPower(), myHero1.idNum);
        
    }
    
}
