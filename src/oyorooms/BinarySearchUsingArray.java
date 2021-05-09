package oyorooms;

import java.util.Arrays;

public class BinarySearchUsingArray {

	public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int element=5;
        int values=Arrays.binarySearch(arr, element);
        if(values<0){
        	System.out.println("No element is found");
        }else{
        	System.out.println("Element is available in "+values+" possitions ");
        }
	}

}
