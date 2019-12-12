package practice.arrays;

public class RemoveDuplicateFromSortedArray {
	static int removeDuplicates(int[] num) {
		int i = 0;
		for(int j=1;j<num.length;j++) {
			if(num[j]!= num[i]) {
				i++;
			num[i] = num[j];
			}					
		}
		return i+1;
	}
	public static void main(String[] args) {
		int[] num = {0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicateFromSortedArray rm= new RemoveDuplicateFromSortedArray();
		int res = rm.removeDuplicates(num);
		System.out.println("length of array: "+ res);
		
	}

}
