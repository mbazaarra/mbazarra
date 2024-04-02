package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		ManagementCompany company = new ManagementCompany("Company", "12345", 10.0);
        Property property = new Property("Property 1", "City", 1000.0, "Owner");
        int index = company.addProperty(property);
        assertEquals(0, index);
        assertEquals(property, company.getProperties()[0]);
	}

}
