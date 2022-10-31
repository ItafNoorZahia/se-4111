package last;

public class Singleton {
	 private static Singleton uniqueInstance;
	 // other useful instance variable here
	 
	  private Singleton(){} 
	  
	 
	 public static Singleton getInstance() {
		 if(uniqueInstance== null) {
			 uniqueInstance= new Singleton();
		 }
		return  uniqueInstance;
	 }

}
class Clint {

public static void main(String[] args) {
	
	Singleton sn = Singleton.getInstance();
	
			

	}

}
