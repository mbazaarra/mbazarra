package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Propertytest1 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Property property = new Property("Property 1", "City", 1000.0, "Owner");
        assertEquals("Property 1,City,Owner,1000.0", property.toString());
	}

}
