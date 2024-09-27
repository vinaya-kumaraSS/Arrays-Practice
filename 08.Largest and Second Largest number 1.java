static void getFSelement(String[] args) {
		int[] arr = {3,5,7,2,3,5,6};
		int Flarge = Integer.MIN_VALUE;
		int Slarge = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(Flarge < arr[i]) {
				Flarge = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(Slarge < arr[i] && arr[i]!=Flarge) {
				Slarge = arr[i];
			}
		}
		System.out.println(Flarge+" "+Slarge);
		getSecondLargest(arr);
	}
