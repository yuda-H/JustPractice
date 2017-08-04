/*
Remove	Duplicates	from	Sorted	Array
Given a sorted array, remove the duplicates in place such that >
	each element appear only once and return the new length
Do not allocate extra space for another array, you must do this in 
place with constant memory
 */

class Array_2 {
	public static void main(String[] args) {
		int[] arr = new int[]{0,0,1,1,1,2,2,3,3,5,6,9,9,9,9};
		System.out.println(a(arr));
	}
	public static int a(int[] a) {
		int i=1;
		if(a.length==0)
			return 0;
		for(int j=0; j<a.length-1; j++) {
			if(a[j] != a[j+1]) {
				++i;
			}
		}
		return i;
	}
}
