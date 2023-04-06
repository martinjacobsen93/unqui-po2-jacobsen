package ar.edu.unq.tp3;
import java.util.ArrayList;


public class Counter {
	
	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	
	// Punto 1
	public int contarPares() {
		
		int pares = 0;
		
		for (int numero:this.getNumbers()) {
			if (numero % 2 == 0) {
				pares++;
			}
		};
		return pares;
	};
	
	public int contarImpares() {
		
		int impares = 0;
				
		for (int numero:this.getNumbers()) {
			if (numero % 2 != 0) {
				impares++;
			};
		}
		
		return impares;
	}
	
	public int cantidadMultiplos(int numeroX) {
		
		int cantMultiplos = 0;
		
		for (int numero:this.getNumbers()) {
			if (numero % numeroX == 0) {
				cantMultiplos++;
			}
		}
		return cantMultiplos;
	}
	
	public void addNumber(int number) {
		
		listaDeNumeros.add(number);
	}
	
	public ArrayList<Integer> getNumbers() {
		
		return this.listaDeNumeros;
	}
	
	// Punto 2
	public int obtenerNumeroConMasPares(ArrayList<Integer> arrayNumber) {
		
		int maxParesHastaAhora = 0;
		int numeroMasAltoConPares = 0;

		for (int number:arrayNumber) {
			
			int numero = number;
			int cantidadParesDeNumero = 0;
			while (numero != 0) {
				int digito = numero % 10;
				
				if (digito % 2 == 0) {
					cantidadParesDeNumero++;
				}
				
				numero = numero / 10;
				}
			if (cantidadParesDeNumero > maxParesHastaAhora) {
				maxParesHastaAhora = cantidadParesDeNumero;
				numeroMasAltoConPares = number;
			}
			
		}
		
		return numeroMasAltoConPares;
	}
	
	// Punto 3: Multiplos	
	public int hallarMultiploMasAlto(int x, int y) {
		
		int multiploMasAlto = 1000;
		if (x == 0 || y == 0) {
			return 0;
		}
		while (multiploMasAlto != 0) {
			if (multiploMasAlto % x == 0 && multiploMasAlto % y == 0) {
				return multiploMasAlto;
			} else {
				multiploMasAlto--;
			}
		}
		return -1;
	}
	
	// Punto 4: Examinar las expresiones
	
	
    /* 
    a. s.length(): retorna un error debido a que s no está declarado en ningun lado.
    b. t.length(): idem s.length() a menos que sea un valor de tipo String;
    c. l + a: si no son variables que almacenen algun tipo de dato numérico o que sean dos cadenas de string, devolverá un error.
    d. a.toUpperCase(); si se trata de un dato de tipo string, este será transformado a mayuscula.
    e. "Libertad".indexOf("r"): Realiza un recorrido de caracteres, empezando por el índice 0, y devuelve el número 4, que representa al indice 4,
    				valor en el cual se encuentra la letra "r".
    f. "Universidad".lastIndexOf('i'): Ultimo indice en el cual se encuentra la letra "i".
    "Quilmes".substring(2,4): Devuelve una cadena de string recortada, en la cual devolverá "il".
    (a.length() + a).startsWith("a") devuelve un booleano. En caso de que a sea una cadena de string.
    s == a : devuelve un booleano
    a.substring(1,3).equals("bc"): devuelve booleano
           */
	
	// Punto 5
	
	/* 5.1
	Son tipos de datos integrados en el lenguaje y no requieren de ninguna importación especial. Ejemplos de tipos de datos: int, boolean, String, etc.
	
	5.2
	int es un tipo de dato primitivo, e Integer es una clase que encapsula un valor de tipo int en un objeto.
	
	5.3
	El valor por default de un int será 0, mientras que el valor de un Integer será null. De igual manera, no es una buena práctica no inicializar variables.
	
	5.4
	Si se intenta acceder a la variable por fuera del scope de la variable de instancia, se obtendrá un error que indica que dicha variable no fué declarada.
	*/ 
	
	
	
	
	
	
	
	
}
