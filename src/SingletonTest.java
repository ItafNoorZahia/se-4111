

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingletonTest {
 public static Singleton sn; 
    
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		sn=Singleton.getInstance();
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	
	}

	@AfterEach
	public void tearDown() throws Exception {
	}
//ITAF
	@Test
	//testsetter
	public void testSetItafConfig()  {
		sn.setItafConfig(14);
		assertEquals(0, sn.getItafConfig());
	}

    @Test
    //testgetter
    public void testGetItafConfig() {
    	
    
}
  //ITAF
  //NOOR
	@Test
	//testsetter
	 public void testSetNoorConfig() {
		sn.setItafConfig(0);
		assertEquals(0, sn.getItafConfig());
	}

    @Test
  //testgetter
    public void testGetNoorConfig() {
    	
}
    //Noor
    
    //zahia 
    @Test
  //testsetter
	public void testSetZahiaConfig() {
    	sn.setZahiaConfig(7);
		assertEquals(0, sn.getZahiaConfig());
	}

    @Test
  //testgetter
    public void testGetZahiaConfig() {
    
}   
}
//ITAF
//NOOR
//zahiaa