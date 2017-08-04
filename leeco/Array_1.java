import java.util.Arrays;
import java.util.Scanner;

/*
Remove	Element
Given an array and a value, remove all instances of that >
	value in place and return the new length.
The order of elements can be changed. It does not matter 
what you leave beyond the new length.
*/

class Array_1 {
	public static void main(String[] args) {
		int[] num = new int[222];
		for(int i=0; i<num.length; i++){
			num[i] = (int)(Math.random()*11);
		}
		System.out.println(Arrays.toString(num)+" length = "+num.length);
		Scanner scan = new Scanner(System.in);
		System.out.print("請選擇要刪除的數字之index = ");
		int index = scan.nextInt();
		System.out.println("new length = "+ reLength(num, index));
	}
	
	public static int reLength(int[] a , int index) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] != a[index])
				++count;
		}
		return count;
	}
	
}