package myproject;

public class zahiaClient {
	public static void main(String[] args) {
		zahiaSengleton sn = zahiaSengleton.getInstance();
		sn.setMyName("zahia ashraf");
		System.out.println(sn.getMyName());
		

}
}