public class DeconstrucionNumero {
	public static void main (String[] args) {
		
		int nuemero1 = 200; // Primer numero
		int numero2 = 569; // Segundo numero
		int nuemero3 = 777; // Tercer numero
		
		
		// Extraer las cifras individuales
		int cifra1= nuemero1%10;
		int cifra2= (numero2 /10) %10;
		int cifra3= (nuemero3 /100) % 10;
		
		

		int nuemroGenrado = cifra1 * 100 + cifra2 * 10 + cifra3;
		
		System.out.println( "Numero generado:" + numeroGenerado);
		
		
		
	}
}