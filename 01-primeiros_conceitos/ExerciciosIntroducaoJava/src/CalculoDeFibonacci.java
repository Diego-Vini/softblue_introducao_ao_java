
public class CalculoDeFibonacci {
	public static void main(String[] args) {
		int j = 1;
		int i1 = 9;
		int i2 = 0;
		
		if(i1 > 3) {
			i2 = 8;
		}
		System.out.println(i2);
		
		for (int i = 0, cont = 0; cont < 15; cont++) {
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
		}
				
	}
}
