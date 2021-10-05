
public class FatorialRecursiva {
	public static void main(String[] args) {
		int valor = 5;
		
		int resposta = calculaFatorial(valor);
		
		System.out.println(resposta);
	}
	
	static int calculaFatorial(int num) {
		if (num == 0) {
			return 1;
		}
		
		return num * calculaFatorial(num-1);
	}
}
