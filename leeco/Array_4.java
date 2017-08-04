import java.util.Arrays;

/*
Plus One
Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digits is at the head of the list.
*/
class Array_4 {
	public static void main(String[] args) {
		int[] arr = new int[]{1764};
		
		System.out.println(Arrays.toString(plusOne(arr)));
	}
	
	public static int[] plusOne(int[] a) {
      int num = a[0]+1;
      int i=1;
      int digits=0;
      do {
    	  i *= 10;
    	  digits++;
      }while (num/i !=0);
      i/=10;
      int[] nArr = new int[digits];
      for(int j=0; j<digits; j++) {
    	  nArr[j] = num/ i;
    	  num %= i;
    	  i/=10;
      }
      return nArr;
    }
}