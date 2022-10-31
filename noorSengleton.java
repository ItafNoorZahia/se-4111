package project4111;

public class noorSengleton {
	 private static noorSengleton uniqueInstance;
	// other useful instance variable here
	   private noorSengleton(){} 
	   private String MyName;		 
	 public static noorSengleton getInstance() {
			if(uniqueInstance== null) {
				 uniqueInstance= new noorSengleton();
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
