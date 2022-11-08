package Singleton;

public class Singleton {
	
private static Singleton uniqueInstance;
// other useful instance variable here
private Singleton() {
	System.out.println("Itaf Ashraf Alayouti");
	System.out.println("Noor Abdulrahman Olayan");
	System.out.println("zahia ashraf attili");
	
} 

private int ItafConfig;
		  
		 
public static Singleton getInstance() {
    if(uniqueInstance== null) {
	   uniqueInstance= new Singleton();
	}
	return  uniqueInstance;
}
//Itaf
/*
 *this function to set pH number  
 * @param ph number
 */
//Itaf
public void setItafConfig(int I) {
	
	if(I<7)
	  System.out.println("The compound is acidic");
	else
	if(I>7)
		System.out.println("The compound is base ");
	else
	if(I==7)
	System.out.println("The compound is natural");	
	else
    System.out.println("Error entry");	
	
}
 public int getItafConfig() {
	return this.I;
}
//ITAF
}


//Itaf

