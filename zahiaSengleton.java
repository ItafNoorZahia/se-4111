package myproject;

public class zahiaSengleton {
	 private static zahiaSengleton uniqueInstance;
	// other useful instance variable here
	   private zahiaSengleton(){} 
	   private String MyName;		 
	 public static zahiaSengleton getInstance() {
			if(uniqueInstance== null) {
				 uniqueInstance= new zahiaSengleton();
	 }
			return  uniqueInstance;
	  }
					
					
				// other useful methods here
	 public String getMyName() {
		    return MyName;
		}

		public void setMyName(String MyName) {
		    this.MyName = MyName;
		}

}
