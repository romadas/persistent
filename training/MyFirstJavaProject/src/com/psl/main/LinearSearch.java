package com.psl.main;
public class LinearSearch {

	public static int LinearSearch(int arr[], int x) {
	
		for(int i = 0; i < arr.length; i++) {
	
			if(arr[i] == x) {
	
				return i;
	
			}
	
		}
	
	return -1;
	
	}

	public static void sorting(int arr[]) {
	
		for(int i = 0; i < arr.length; i++) {
	
			for(int j = i+1; j < arr.length;j++) {
	
				if(arr[i]>arr[j]) {
	
					int temp = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = temp;
					
				}
	
			}
	
		}
	
	}

	public static void main(String args[]) {

		int arr[] = {1,3,10,9,8,6};

		int x = 10;

		int result  = LinearSearch(arr,x);

		if(result == -1) {

			System.out.println("number is not present");

			}

		else {

			System.out.println(result);

		}

		sorting(arr);
		
			for(int xy : arr) {
		
				System.out.println(xy);
		
			}
		
	}
		
}
		
		
		
