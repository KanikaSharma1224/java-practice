package practice.algorithms;

public class MaximumDiffVersion2 {
	public static int maxDiff(int[] arr, int size) {
		int min_element = arr[0];
		int max_diff = arr[1]-arr[0];
		int i;
		for(i=1;i<size;i++) {
			if((arr[i]-min_element) > max_diff) {
				max_diff = arr[i]- min_element;
			}
			if(arr[i]<min_element) {
				min_element = arr[i];
			}			
		}
		return max_diff;
	}
	
	public static void main(String[] args) {
		MaximumDiffVersion2 mdv2 = new MaximumDiffVersion2();
		int[] arr = {1,2,90,10,110};
		int result = maxDiff(arr,arr.length);
		System.out.println("Maximum Difference : "+result);
	}

}
