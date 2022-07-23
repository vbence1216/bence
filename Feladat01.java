public class Feladat01 {
	public int feladat01(String[] szinek) {
		int szinekszama = szinek.length;
		int sum = 0;
		
		for(int i = 2; i <= szinekszama; i++ ) {
			int mul = 1;
			
			for(int j = 0; j < i; j++ ) {
				mul = mul * (szinekszama - j);
				mul = mul / (j+1);
			}
			
			sum = sum + mul;
		}		
		
		return sum;
	}
}
