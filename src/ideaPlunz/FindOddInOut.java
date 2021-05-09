package ideaPlunz;

public class FindOddInOut {

	public static void main(String[] args) {
		int ar[]={2,2,2,2,2,4};
		int i,j=1,flag=0;
		for(i=0;i<ar.length-1;i++){
			if(ar[i]!=ar[j]){
				flag=1;
				break;
			}
			j++;
		}
		if(flag==1){
			System.out.println("Not same");
		}
		else{
			System.out.println("Both are same");
		}
	}

}
