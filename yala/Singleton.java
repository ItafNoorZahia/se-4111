

public class Singleton {
	
private static Singleton uniqueInstance;
// other useful instance variable here
private Singleton() {
	System.out.println("Itaf Ashraf Alayouti");
	System.out.println("Noor Abdulrahman Olayan");
	System.out.println("zahia ashraf attili");
	
} 


private int ItafConfig;
private int NoorConfig;		  
private int ZahiaConfig;

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
	 assert I>=0 || I<=14;
	 
	if((I>=0)&&(I<7)) {
	  System.out.println("The compound is acid");
	}
	else 
	if((I>7)&&(I<=14)) {
		System.out.println("The compound is base ");
	}
	
	else
	if(I==7) {
	System.out.println("The compound is natural");	
	}
	else
   System.out.println("Error entry");
	

}

 public int getItafConfig() {
	
	return this.ItafConfig;
}
//ITAF
 //NOOR
 public void setNoorConfig(int N) {
	 assert N>=0 || N<=14;
	 
		if((N>=0)&&(N<7)) {
		  System.out.println("The compound is acid");
		}
		else 
		if((N>7)&&(N<=14)) {
			System.out.println("The compound is base ");
		}
		
		else
		if(N==7) {
		System.out.println("The compound is natural");	
		}
		else
	   System.out.println("Error entry");
	}
	 public int getNoorConfig() {
		return this.NoorConfig;
	}
	 
 //zahia
	 public void setZahiaConfig(int z) {
		 assert z>=0 || z<=14;
		 
			if((z>=0)&&(z<7)) {
			  System.out.println("The compound is acid");
			}
			else 
			if((z>7)&&(z<=14)) {
				System.out.println("The compound is base ");
			}
			
			else
			if(z==7) {
			System.out.println("The compound is natural");	
			}
			else
		   System.out.println("Error entry");
		}
		 public int getZahiaConfig() {
			return this.ZahiaConfig;
		}
		 
	 
}


//Itaf
//zahia
