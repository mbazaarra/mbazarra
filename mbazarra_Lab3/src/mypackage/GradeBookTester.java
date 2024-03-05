package mypackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	 private GradeBook g1;
	 private GradeBook g2;

	@Before
	public void setUp() throws Exception {
	    g1 = new GradeBook(5);
	    g2 = new GradeBook(5);
	    g1.addScore(50);
	    g1.addScore(75);
	    g2.addScore(80);
	    g2.addScore(90);
	}

	@After
	public void tearDown() throws Exception {
	    g1 = null;
	    g2 = null;
	}

	@Test
	public void testAddScore() {
		 assertEquals("50.0 75.0", g1.toString());
		 assertEquals("80.0 90.0", g2.toString());
		 assertEquals(2, g1.getScoreSize());
		 assertEquals(2, g2.getScoreSize());
	}

	@Test
	public void testSum() {
		 assertEquals(125.0, g1.sum(), 0.001);
		 assertEquals(170.0, g2.sum(), 0.001);
	}

	@Test
	public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.001);
        assertEquals(80.0, g2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(75.0, g1.finalScore(), 0.001);
	    assertEquals(90.0, g2.finalScore(), 0.001);
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
	    assertEquals(2, g2.getScoreSize());
	}

	@Test
	public void testToString() {
	    assertEquals("50.0 75.0", g1.toString());
	    assertEquals("80.0 90.0", g2.toString());
	}

}
