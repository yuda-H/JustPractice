/*
Remove	Duplicates	from	Sorted	Array	II
Follow up for "Remove Duplicates":
	What if duplicates are allowed at most twice?
*/
class Array_3 {
	public static void main(String[] args) {
		int[] arr = new int[]{0,0,1,1,1,2,2,3,3,5,6,9,9,9,9};
		
		System.out.println(size(arr));
	}
	public static int size(int[] a) {
		if (a.length==0) {
			return 0;
		}
		int counter = 0;
		int size = 0;
		for(int i=0; i<a.length-2; i++) {
			if(a[i] != a[i+1]) {
				size++;
				counter=0;
			} else {
				size++;
				if(++counter>1) {
					size--;
				}
			}
		}
		return size+1;
	}
}