package itaf;

public class ItafClint {

	public static void main(String[] args) {
		ItafSengleton sn = ItafSengleton.getInstance();
		sn.setMyName("Itaf Ashraf Alayouti");
		System.out.println(sn.getMyName());
		
		
	}

}
