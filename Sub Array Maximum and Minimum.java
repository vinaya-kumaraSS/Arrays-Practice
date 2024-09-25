package A_Arrays;

public class SubArray_max_min_sum {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		MaxMinSum(arr);
	}
	public static void MaxMinSum(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length; j++) {
				int sum = 0;
				for(int k=i; k<=j; k++) {
					sum = sum + arr[k];
				}
				if(sum > maxSum) {
					maxSum = sum;
				}
				if(sum < minSum) {
					minSum = sum;
				}
			}
		}
		System.out.println("maximum sum :"+maxSum);
		System.out.println("minimum sum :"+minSum);
	}
}


//maximum sum :30
//minimum sum :2
