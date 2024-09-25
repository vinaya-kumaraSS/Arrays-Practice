package A_Arrays;

public class ArrayPairs {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		printArrayPair(arr);
	}
	public static void printArrayPair(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				System.out.print("("+arr[i]+","+arr[j]+") ");
			}
			System.out.println();
		}
	}
}

// total number of pairs is ==> 10
// 			n(n-1) / 2
//			5(5-1)/2 = 5*4/2 = 20/2 = 10
