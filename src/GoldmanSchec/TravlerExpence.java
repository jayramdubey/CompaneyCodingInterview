package GoldmanSchec;

public class TravlerExpence {

	public static void main(String[] args) {
      int exp[]={4,2,-13};
      int res= findTheval(exp);
      System.out.println(res);
	}

	private static int findTheval(int[] exp) {
       int count=0, result=0;
       for(int eachDayMoney:exp){
    	 count+=eachDayMoney;
    	 if(count<=0){
    		result= Math.abs(count)+1;
    		count=1;
    	 }
       }
	return result;
	}

}
