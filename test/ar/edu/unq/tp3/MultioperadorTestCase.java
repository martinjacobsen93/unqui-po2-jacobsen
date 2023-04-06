package ar.edu.unq.tp3;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	Multioperador multiOperador = new Multioperador(); 
	
	@Test
	 void suma() {
		Assert.assertEquals(10, multiOperador.sumarNumeros());
	}
	
	@Test
	 void resta() {
		Assert.assertEquals(-8, multiOperador.restarNumeros());
	}
	
	@Test
	 void multiplicacion() {
		Assert.assertEquals(24, multiOperador.multiplicarNumeros());
	}
	
}