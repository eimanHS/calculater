package calculater;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class First_test {
	Controler c1 ;
	Model m1;
	
	
	
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}

//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

	@BeforeEach
	void setUp() throws Exception {
	      c1 = new Controler();
	      m1 = new Model();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	void test() {
	assertEquals(5,m1.add(3,2));
	}

}
