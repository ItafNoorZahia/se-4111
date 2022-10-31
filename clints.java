package l;

public class clints {


public static void main(String[] args) {
	
	Singleton sn = Singleton.getInstance();
	 sn.setMyName("Itaf Alayouti");
    System.out.println(sn.getMyname());
    sn.setMyName("Noor Olayan");
    System.out.println(sn.getMyname());

    sn.setMyName("zahia ashraf");
    System.out.println(sn.getMyname());

}

}


