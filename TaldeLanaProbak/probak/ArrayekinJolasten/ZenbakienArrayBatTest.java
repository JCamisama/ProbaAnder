package ArrayekinJolasten;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZenbakienArrayBatTest {

	ZenbakienArrayBat unaArraySalvajeAparecio;
	
	@Before
	public void setUp() throws Exception {
		
		unaArraySalvajeAparecio = new ZenbakienArrayBat();
		
		unaArraySalvajeAparecio.gehituZenbakia(1);
		unaArraySalvajeAparecio.gehituZenbakia(2);
		unaArraySalvajeAparecio.gehituZenbakia(3);
		unaArraySalvajeAparecio.gehituZenbakia(4);
		unaArraySalvajeAparecio.gehituZenbakia(5);
		unaArraySalvajeAparecio.gehituZenbakia(6);
	}

	@After
	public void tearDown() throws Exception {
		
		unaArraySalvajeAparecio = null;
	}

	@Test
	public void testZenbakienArrayBat() {
		
		assertNotNull(unaArraySalvajeAparecio);
	}

	@Test
	public void testInprimatuNikNahiDitudanak() {
		
		unaArraySalvajeAparecio.inprimatuNikNahiDitudanak(3,4);
	}


}
