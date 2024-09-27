package A_Arrays;

public class First_and_second_largest {
	public static void main(String[] args) {
		int[] arr = {1,3,5,6,40,3,2,3,100};	
		int largest = Integer.MIN_VALUE;
		int Slargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				Slargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > Slargest && arr[i] < largest){
				Slargest = arr[i];
			}
		}
		System.out.println("largest :"+largest);
		System.out.println("Slargest :"+Slargest);
	}
}
