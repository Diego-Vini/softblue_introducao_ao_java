
public class ImprimeMedia {
	public static void main(String[] args) {
		
	double n1 = 8.5, n2 = 7.5, n3 = 6.0;
	int p1 = 3, p2 = 2, p3 = 5;
	
	double somaMediapOnderada = (p1 * n1) + (p2 * n2) + (p3 * n3);
	int somaPeso = p1 + p2 + p3;
	
	double mediaDoAluno = somaMediapOnderada / somaPeso;
	
	System.out.println(mediaDoAluno);
		
	}
}
