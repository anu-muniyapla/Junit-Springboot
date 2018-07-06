package trialspringboot.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import trialspringboot.bootstarter.Bootstart;
import trialspringboot.bootstarter.controller.Hellocontroller;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Bootstart.class)

public class TestDist {
	@Autowired
	Hellocontroller h;
	
	@Test
	public void test1() {
		System.out.println("Test has run.");
	 assertEquals(4, h.calculatorDist(2,2));
	}
	
	
	@Test 
	public void test2() {
		System.out.println( h.CalDist(1, 1, 1, 1));
		assertEquals(0.0, h.CalDist(1, 1, 1, 1),0.1);
		//assertEquals(3.605551275463989, h.CalDist(4, 1, 2, 4));
	
	}
}
