package practice.strings;

public class ConCateTwoStrings {
	void conCatAndReverseOfStrings(String s1, String s2) {
		String s3 = s1+s2;
		char[] arr = s3.toCharArray();
		System.out.println(s3);
		int len = s3.length();
		int j=len - 1;
		for(int i=0;i<j;j--,i++) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(arr);
		
	}
	
	public static void main(String[] args) {
		String s1 = "Geeks";
		String s2 = "forGeeks";
		ConCateTwoStrings cc = new ConCateTwoStrings();
		cc.conCatAndReverseOfStrings(s1, s2);
		
	}
	

}
