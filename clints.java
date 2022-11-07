package l;

public class clints {


public static void main(String[] args) {
	
	Singleton sn = Singleton.getInstance();
	 sn.setMyName("Itaf Ashraf Alayouti");
    System.out.println(sn.getMyname());
    sn.setMyName("Noor Abdulrahman Olayan");
    System.out.println(sn.getMyname());

    sn.setMyName("zahia ashraf attili");
    System.out.println(sn.getMyname());

}

}


