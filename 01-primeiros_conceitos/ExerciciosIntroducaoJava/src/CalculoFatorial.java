
public class CalculoFatorial {
	public static void main(String[] args) {
		int fatorial = 5;
		int calcFatorial = 0;
		int novoFatorial = fatorial;
		
		for(int i = 0; i <= fatorial; i++ ) {
			calcFatorial = novoFatorial * (fatorial - 1);
			
			novoFatorial = calcFatorial;
			fatorial--;
		}
		
		System.out.println(calcFatorial);
	}
}
