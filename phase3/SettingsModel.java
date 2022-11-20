
public class SettingsModel {
	private static SettingsModel uniqueInstance;

	// other useful instance variables here

		private SettingsModel() {
		}
		
		private int ItafConfig;
		
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
			

		}

		 public int getItafConfig() {
			
			return this.ItafConfig;
		}
		//ITAF
}
