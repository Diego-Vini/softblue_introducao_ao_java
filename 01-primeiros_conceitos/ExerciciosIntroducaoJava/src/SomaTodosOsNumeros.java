/*Começando em 0, imprima os números seguintes, enquanto a soma dos números já 
impressos for menor que 100. */

public class SomaTodosOsNumeros {
	public static void main(String[] args) {
		int x = 100;
		int soma = 0;
		int i = 0;
		
		for (i = 0; i < x; i++) {
			soma += i;
			if(soma >= 100) {
			  break;
			}
			System.out.println(soma);
		}
	}
}
