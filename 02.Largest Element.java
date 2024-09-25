package A_Arrays;

public class largestElement {
	public static void main(String[] args) {
		int[] arr = {2,6,8,4,7,3,204,76};
		System.out.println("largest element: "+Largest(arr));
	}
	public static int Largest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
}
