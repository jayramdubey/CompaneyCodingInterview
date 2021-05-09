package mindtree;
import java.util.Scanner; 
public class VowelToNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		s.toLowerCase();
		char ch[]=s.toCharArray();
		
		/*
		s = s.replaceAll("[AaEeIiOoUu]", "*");
		System.out.print(s);*/
		
		int size=ch.length;
		int c=1;
		for(int i=0;i<size;i++){
			if(ch[i]=='a'){
				ch[i]='1';
				System.out.print(ch[i]);
			}
			else if(ch[i]=='e'){
				ch[i]='2';
				System.out.print(ch[i]);
			}
			else if(ch[i]=='i'){
				ch[i]='3';
				System.out.print(ch[i]);
			}

			else if(ch[i]=='o'){
				ch[i]='4';
				System.out.print(ch[i]);
			}
			else if(ch[i]=='u'){
				ch[i]='5';
				System.out.print(ch[i]);
			}
			else
				System.out.print(ch[i]);
			
			
		}

	}

}
