package inz;

public class Sengleton {
	
 private static Sengleton uniqueInstance;
 // other useful instance variable here
 
  private Sengleton(){} 
 
 public static Sengleton getInstance() {
	 if(uniqueInstance== null) {
		 uniqueInstance= new Sengleton();
	 }
	return  uniqueInstance;
 }
	
	
// other useful methods here
}
