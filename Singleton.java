package last;

public class Singleton {
	 private static Singleton uniqueInstance;
	 // other useful instance variable here
	 
	  private Singleton(){} 
	  private static myname;
	 
	 public static Singleton getInstance() {
		 if(uniqueInstance== null) {
			 uniqueInstance= new Singleton();
		 }
		return  uniqueInstance;
	 }
public String getmyname() {
	return myname;
}
public void setmyname(String myname) {
	
	this.myname=myname;
}

}
class Clint {

public static void main(String[] args) {
	
	Singleton sn = Singleton.getInstance();
	
			sn=setmyname("Noor Olayan");
			System.out.println(sn.getmyname());

	}

}
