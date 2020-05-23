package SanityTests;

import java.util.Scanner;

public class ArrayInMethod {
	
	public int[] max(int a[], int s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<s; i++) {
	         a[i] = sc.nextInt();
	      }
		
		
		return a;
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr2 [] = {1,2,3};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size =sc.nextInt();
		int arr2[] = new int[size];
		ArrayInMethod o = new ArrayInMethod();
		o.max(arr2, size);
		for(int i =0;i<arr2.length; i++){
			System.out.println("arr2[i]="+arr2[i]);
		}
		
		
	
	}

}
