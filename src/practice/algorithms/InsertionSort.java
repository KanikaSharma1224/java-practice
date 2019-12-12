package practice.algorithms;

public class InsertionSort {
	static void insertionSort(int[] unsort) {
		int[] temp = unsort;
		int len = temp.length;
		for(int j=1;j<len;j++) {
			for(int i=0;i<j;i++) {
				if(temp[i]>temp[j]) {
					int tmp = temp[i];
					temp[i] = temp[j];
					temp[j] = tmp;
				}
				
			}
			
		}
		for(int d: temp) {
			System.out.print(d +" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {31,41,59,26,41,58};
	    new InsertionSort().insertionSort(arr);
	}

}
