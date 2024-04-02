package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Plottest1 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Plot plot1 = new Plot(0, 0, 2, 2);
        Plot plot2 = new Plot(1, 1, 2, 2);
        assertTrue(plot1.overlaps(plot2));
	}

}
