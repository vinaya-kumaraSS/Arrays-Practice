package A_Arrays;

public class subArrays {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		getSubArray(arr);
	}
	public static void getSubArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

// total subarray ==>
//		n(n+1) / 2
