
package ass3;


public class SuperHero {
    String name;
    String superPower;
    int idNum;
    private static int idCounter = 0;//Private instance variable set to 0, counter will add one to it 
    
    public SuperHero(String name, String superPower){ //Constructor for SuperHero
        this.name = name;
        this.superPower = superPower;
        this.idNum = idCounter ++; //Counter, adds one to private static variable everytime hero is created
        System.out.printf("SuperHero Constructed: %s%n%s%n%d%n", this.name,this.superPower,this.idNum); //Test line of code which will show in output
    }
    
    public String getName(){ //get name method
        
        return this.name;
    }
    
    public String getSuperPower() //get super power method
    {
        return this.superPower;
    }
    
    public int getIDNum() //get ID number method
    { 
        return this.idNum;
    }
    
    public void setName(String name) //Set name method
    {
        if(name != null) //If name isn't null then will set name
        {
            this.name = name;
        }
    }
    
    public void setSuperPower(String superPower)//Set super power method
    {
        if(superPower != null)//If superpower isn't null then will set superpower
        {
            this.superPower = superPower;
        }
    }
    
    
    
}
