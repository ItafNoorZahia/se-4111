
public class SettingsModel {
	private static SettingsModel uniqueInstance;

	// other useful instance variables here

		private SettingsModel() {
		}
		
		private int ItafConfig;
		private int NoorConfig;		  
		private int ZahiaConfig;
		
		public static SettingsModel getInstance() {
			if (uniqueInstance == null) {
				uniqueInstance = new SettingsModel();
			}
		
			return uniqueInstance;
		}
		// other useful methods here
		//Itaf
		/*
		 * 
		 *this function to set pH number  
		 * @param ph  int number
		 * 
		 * 
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
        ItafConfig = I;

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
				NoorConfig = N;
				
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
					ZahiaConfig = z;
				}
				 public int getZahiaConfig() {
					return this.ZahiaConfig;
				}
				
}
