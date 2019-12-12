package practice.algorithms;

public class MaximumDiff {
	public static void maxDiff(int[] arr) {
		int previous_diff =0;
		int current_diff=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					current_diff = arr[j]-arr[i];
				}
				if(current_diff>previous_diff) {
				  previous_diff = current_diff;
			}			
		}
		
	}
		System.out.println("Current_Diff: "+ current_diff);
		System.out.println("Maximum Difference "+previous_diff);
}
	public static void main(String[] args) {
		int[] numbers = {1,2,90,10,110};
		new MaximumDiff().maxDiff(numbers);
		
	}

}
