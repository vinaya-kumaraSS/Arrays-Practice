package A_Arrays;
public class linearSearch {
	public static void main(String[] args) {
		int[] arr = {1,4,6,3,456,8,23,9};
		int key = 10;
		System.out.println(searchElement(arr, key));
	}
	public static int searchElement(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
