package l;

public class Singleton {


	 private static Singleton uniqueInstance;
	 // other useful instance variable here
	  
	  private Singleton() {} 
	  private String MyNamee; 


	 public static Singleton getInstance() {
		 if(uniqueInstance== null) {
			 uniqueInstance= new Singleton();
		 }
		return  uniqueInstance;
	 }
	 public String getMyname() {
			return MyName;
		}
		public void setMyName(String MyName) {
			this.MyName= MyName;
		}
}