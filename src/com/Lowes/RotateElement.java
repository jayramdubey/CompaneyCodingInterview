package com.Lowes;

public class RotateElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		RotateElement obj = new RotateElement();
		int len = arr.length;
		obj.rotateelement(arr, 2, len);
		obj.printResult(arr, len);
	}

	private void printResult(int[] arr, int len) {
         for(int i=0;i<len;i++){
        	 System.out.print(" "+arr[i]);
         }
	}

	private void rotateelement(int[] arr, int d, int len) {
		
		for (int i = 0; i < d; i++) {
			leftrotateArray(arr, len);
		}
	}

	private void leftrotateArray(int[] arr, int len) {
		int tmp,i;
		tmp= arr[0];
        for(i=0;i<len-1;i++){
        	arr[i]=arr[i+1];
        }
        arr[i]=tmp;
	}

}
