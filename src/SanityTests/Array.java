package SanityTests;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2},{3,4},{5,6}};
		
		System.out.println("arr length ="+arr.length);
		int arr1[][]=new int[3][2];
		System.out.println("arr1 length ="+arr1.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]length ="+arr[i].length);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
	}

}
