package crecto.com;

public class SubArray {

	public static void main(String[] args) {
		int bAr[]= {1,2,3,4,5};
		int sAr[]= {1,3,2,5,4};
		int larr[]=new int[10];
		int lenb=bAr.length;
		int lena=sAr.length;
		int p=0;
		int c=0;
		if(lena<=lenb) {
			for(int i=0;i<lenb;i++) {
				
				larr[bAr[i]]+=1;
			
			}
		for(int i=0;i<lena;i++)
		   {
			larr[sAr[i]]-=2;
			}
         for(int i=0;i<larr.length;i++)
            {
				if(larr[i]==-1) {
					p++;
				}
			}
         if(lena==p) {
        	 c++;
        	 System.out.println("an array is subset of another array ");
         }
			
		}
	if(c==0)
			System.out.println("not subset: ");
		

	}

}
