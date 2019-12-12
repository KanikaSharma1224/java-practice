package practice.algorithms;

public class InsertionSortDecreasingOrder {
	
	static void insertionSortDO(int[] streamInput) {
		int[] temp = streamInput;
		int length = temp.length;
		for(int j=2;j<length;j++) {
			for(int i=0;i<j;i++) {
				if(temp[j]>temp[i]) {
					int tmp = temp[i];
					temp[i] = temp[j];
					temp[j] = tmp;					
				}				
			}
		}
		for(int t : temp) {
			System.out.print(t +" ");
		}
		
	}
	public static void main(String[] args) {
		int[] unsortedArr = {31,41,59,26,41,58};
		new InsertionSortDecreasingOrder().insertionSortDO(unsortedArr);		
	}

}
