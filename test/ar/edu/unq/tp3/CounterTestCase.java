package ar.edu.unq.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(2222);
		counter.addNumber(506);
		counter.addNumber(141);
		counter.addNumber(40);
		}

	@Test
	void testEvenNumbers() {
		int numerosPares = counter.contarPares();
		
		Assert.assertEquals(3, numerosPares);
	}
	
	@Test
	void testNumeroMasAlto() {
		// Obtiene el número más alto de pares del arreglo y lo compara con el value expected.
		
		Assert.assertEquals(2222, counter.obtenerNumeroConMasPares(counter.getNumbers()));
	}
	
	@Test
	void hallarMultiploMasAlto() {
		// Obtiene el número más alto de pares del arreglo y lo compara con el value expected.
		
		Assert.assertEquals(1000, counter.hallarMultiploMasAlto(1,2));
	}

}