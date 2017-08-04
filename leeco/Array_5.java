import java.util.Arrays;

class Array_5 {
	public static void main(String[] args) {
		pasPrint(10);
	}
	public static void pasPrint(int a) {
		int[][] pascal = new int[a][];
		for(int i=0; i<a; i++) {
			// pascal[][] = { {_}, {_ _}, {_ _ _}, {_ _ _ _}, {_ _ _ _ _} }
			pascal[i] = new int[i+1];
			pascal[i][0] = 1;
			if(i>1) {
				for(int j=1; j<pascal[i].length-1; j++) {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
				}
			}
			pascal[i][pascal[i].length-1] = 1;
		}
		for(int i=0; i<pascal.length; i++) {
			for(int j=-i+pascal.length/2+3; j>=0; j--) {
				System.out.print(" ");
			}
			System.out.println(Arrays.toString(pascal[i])); 
		}
	}
}
