package kuliza;

public class TryCatcProblem {

	public static void main(String[] args) {
		try{
			int res= 10/0;
		}finally{
			System.out.println("You can't devide number as 0 ");
		}
		
	}

}
