package A_Arrays;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = {1,3,6,7,9,10,25,67,87};
		int key = 1;
		System.out.println(BSearch(arr, key));
	}
	public static int BSearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end) / 2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key < arr[mid]) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
