package ar.edu.unq.tp3;

public class Multioperador {
	
	private int[] numeros = {1,2,3,4};
	
	public int[] getNumeros() {
		return numeros;
	}
	 
	int sumarNumeros() {
		int sumaHastaAhora = 0;
		for (int numero:this.getNumeros()) {
			sumaHastaAhora+=numero;
		}
		return sumaHastaAhora;
	}
	
	int restarNumeros() {
		int total = this.getNumeros()[0]; // toma el primer valor del arreglo y este va a ser restado por el resto de los números
										  // Precondición: el arreglo debe tener al menos 1 elemento.
		for (int i = 1; i < this.getNumeros().length; i++) {
			total = total - this.getNumeros()[i];
		}
		return total;
	}
	
	int multiplicarNumeros() {
		
		int total = this.getNumeros()[0];
		
		for (int i = 1; i < this.getNumeros().length; i++) {
			total = total * this.getNumeros()[i];
		}
		
		return total;
	}
};