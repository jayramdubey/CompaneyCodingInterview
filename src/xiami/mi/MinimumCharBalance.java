package xiami.mi;

public class MinimumCharBalance {

	public static void main(String[] args) {
		String str= "xiaomi";
		int val=printBalance(str);
		System.out.println(val);
	}

	private static int printBalance(String str) {
		int ar2[]= new int[126];
		char ar[]=str.toCharArray();
		int len=ar.length;
		for(int i=0;i<len;i++){
			ar2[ar[i]]+=1;
		}
		int max=ar2[0];
		for(int i=0;i<ar2.length;i++){
			if(max<ar2[i])
				max=ar2[i];
		}
		int result=0;
		for(int i=0;i<ar2.length;i++){
			if(ar2[i]>0)
				result +=max-ar2[i];
		}
		return result;
	}

}
