package myprojects;
import java.util.Scanner;
class Aircon
{
    private String BrandName, Model;
    protected int temperature;
    protected boolean power = false; //attributes
    
    //behavior
    public void setBrandName(String newBrandName)
    {
        BrandName = newBrandName;
    }
    
    public void setModel(String newModel)
    {
        Model = newModel;
    }
    
    public void powerSwitch()
    {
        if(!power)
        {
            power = true;
            temperature = 27;
            System.out.println("Your aircon is now turned on!");
        }
        
        else
        {
            power = false;
            temperature = 36;
            System.out.println("Your aircon is now turned off!");
        }
    }
    
    public void increaseTemperature()
    {
        if(power)
        {
            temperature++; //temperature = temperature + 1 / temperature += 1;
            System.out.println("Temperature has increased!");
        }
        else
            System.out.println("Aircon is not turned on!");
    }
    
    public void decreaseTemperature()
    {
        if(power)
        {
            temperature--;
            System.out.println("Temperature has decreased");
        }
        else
        {
            System.out.println("Aircon is not turned on!");
        }
    }
}

class DigitalAircon extends Aircon
{
    public int showTemperature()
    {
        return temperature;
    }
    
    public void setTemperature(int newTemperature)
    {
        temperature = newTemperature;
    }
    
    public void increaseTemperature()//method overriding from polymorphism hindi na susundan yung code sa parent class
    {
        if(power)
        {
            temperature+=2; //temperature = temperature + 1 / temperature += 1;
            System.out.println("Temperature has increased by 2!");
        }
        else
            System.out.println("Aircon is not turned on!");
    }
    
}

public class inheritance
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int choice;
	    
	    DigitalAircon ac1 = new DigitalAircon();//instantiation
	    ac1.setBrandName("Trane");
	    ac1.setModel("ac0001");
	    System.out.println("\t\tControls\n1. Click Power switch\n2.Increase Temperature\n3.Decrease Temperature\n4.Show Current Temperature\n5.Set Temperature\n0.Exit Program");
	    
	    do
	    {
	        System.out.println("Enter Action Code : ");
	        choice = in.nextInt();
	        
	        if(choice == 1)
	        {
	            ac1.powerSwitch();
	        }

	        else if(choice == 2)
	        {
	            ac1.increaseTemperature();
	        }
	        
	        else if(choice == 3)
	        {
	            ac1.decreaseTemperature();
	        }
	        
	        else if(choice == 4)
	        {
	            System.out.println("The current temperature is: " + ac1.showTemperature());
	        }
	        
	        else if(choice == 5)
	        {
	            System.out.println("Enter desired temperature : ");
	            int temp = in.nextInt();
	            ac1.setTemperature(temp);
	        }
	        
	        else if(choice == 0)
	        {
	            System.out.println("Exiting Program");
	        }
	        
	        else
	        {
	            System.out.println("Invalid Input!");
	        }
	        
	    }while(choice != 0);
	}
}
