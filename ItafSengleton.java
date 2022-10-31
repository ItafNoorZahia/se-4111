package itaf;

public class ItafSengleton {
	
private static ItafSengleton uniqueInstance;
//other useful instance variable here
private ItafSengleton(){} 
private String MyName;		 
public static ItafSengleton getInstance() {
if(uniqueInstance== null) {
 uniqueInstance= new ItafSengleton();
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
