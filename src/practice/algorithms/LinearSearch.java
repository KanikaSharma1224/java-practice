package practice.algorithms;

public class LinearSearch {
	public static int linearSearch(int[] arr, int num) {
		int i;
		for(i=0;i<arr.length;i++) {
			if(num == arr[i]) {				
				return i;
			}			
		}
		return -1;		
	}
	public static void main(String[] args) {
		int[] numbers = {31,41,59,26,43,58};
		LinearSearch ls = new LinearSearch();
		int result = ls.linearSearch(numbers, 47);
		if(result ==-1) {
			System.out.println("Number not found");
		}
		else
			System.out.println("Given Number exists at index :"+result);
		
	}

}
