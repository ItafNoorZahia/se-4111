package project4111;

public class noorClient {
	public static void main(String[] args) {
		noorSengleton sn = noorSengleton.getInstance();
		sn.setMyName("Noor Olayan");
		System.out.println(sn.getMyName());
		
		
	}

}
