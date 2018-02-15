package calculater;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Seconnd_test {
	Controler c1;
	view v;
	Model m;
	String[] ar= {"2","+","5","="}; 

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}

//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

	@BeforeEach
	void setUp() throws Exception {
		c1 =new Controler();
		m= new Model();
		v= new view();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void add_test() {
		assertEquals(7,c1.work(ar,m,v),0);
	}
	@Test
	public void divOnZ_test(){
		ar[0]="2";
		ar[1]="/";
		ar[2]="0";
		ar[3]="=";
		assertEquals(1,c1.work(ar,m,v),0);}
	@Test
	public void moodOnZ_test(){
		ar[0]="2";
		ar[1]="%";
		ar[2]="0";
		ar[3]="=";
		assertEquals(1,c1.work(ar,m,v),0);}
	@Test
	public void sqrOfNeq_test(){
		ar[0]="-8";
		ar[1]="s";
		ar[2]="=";
		assertEquals(1,c1.work(ar,m,v),0);
		
	}

}
