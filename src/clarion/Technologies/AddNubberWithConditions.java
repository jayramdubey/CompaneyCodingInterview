package clarion.Technologies;

public class AddNubberWithConditions {

	public static void main(String[] args) {
		
		int result= sumofNumber(20);
		System.out.println(" Result: "+result);
	}
     public static int sumofNumber(int n){
    	 int res=0;
    	 for(int i=1;i<=n;i++){
    		 if(i%3==0|| i%5==0){
    			 res +=i;
    		 }
    		 continue;
    	 }
		return res;
	
}
}
