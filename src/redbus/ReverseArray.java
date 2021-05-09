package redbus;

public class ReverseArray {

	public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};
       int len=arr.length-1;
       int start=0;
       reverseArr(arr,start,len);
       printArr(arr,len);
       
	}

	private static void printArr(int[] arr, int len) {
		System.out.print("reverse of array ");
		for(int i=0;i<=len;i++){
			System.out.print(" "+arr[i]);
		}
	}

	private static void reverseArr(int[] arr, int start, int len) {

	  int tmp=0;
      while(start<len){
    	  tmp=arr[start];
    	  arr[start]=arr[len];
    	  arr[len]=tmp;
    	  start++;
    	  len--;
      }
		
	}

}
