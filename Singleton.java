package Singleton;

public class Singleton {
	
private static Singleton uniqueInstance;
// other useful instance variable here
private Singleton() {
	System.out.println("Your name");
} 
		  
		 
public static Singleton getInstance() {
    if(uniqueInstance== null) {
	   uniqueInstance= new Singleton();
	}
	return  uniqueInstance;
}
}



