
//mprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
public class SomaNumeros {
	public static void main(String[] args) {
		int x = 100;
		
		for(int i = 0; i < x; i++) {
			int soma = 0;
			
			if(i % 2 == 0) {
				continue;
			}
			
			soma += i;
			
			System.out.println(soma);
		}
				
				
	}
}
