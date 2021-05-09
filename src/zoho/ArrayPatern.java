package zoho;
/*Q. Given an array of integers, rearrange the array 
 * in such a way that the first element is first maximum and second 
 * element is first minimum. 
   Example —> Input: {1, 2, 3, 4, 5, 6, 7} |
   Output : {7, 1, 6, 2, 5, 3, 4}*/
public class ArrayPatern 
  {
	public void seriesOfArray()
	{
		int i,j;
		int a[]={1,2,3,4,5,6,7,8};
		int n=a.length;
		for(i=0,j=n-1;i<j;i++,j--)
		{
			System.out.print(a[j]+" "+a[i]+" ");
		}
		if(n%2!=0){
			System.out.println(a[n/2]);
		}
		
	}
	

	public static void main(String[] args) 
	{
		ArrayPatern ob =new ArrayPatern();
		ob.seriesOfArray();

	}

}
