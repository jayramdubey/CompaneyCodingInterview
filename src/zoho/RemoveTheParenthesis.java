package zoho;

import java.util.Scanner;

/*Remove unbalanced parentheses in a given expression. 
Example —> Input: ((abc)((de)) | Output: ((abc)(de))
*/
public class RemoveTheParenthesis 
  {
	int top=-1;
	int max=10;
	int stack[]=new int[max];
	
	public void push(int val)
	{
		if(top==max-1)
		{
			System.out.println("overflow");
			return;
		}else
		{
			stack[++(top)]=val;
		}
	}
	public int pop()
	{ int num=0;
		if(top==-1)
		{
			System.out.println("Empty");
			//return;
		}else
		{
			num=stack[--top];
		}
			
			return num;
			
	}
	void print()
	{
		if(top==-1)
		{
			System.out.println("Empty");
			//return;
		}
		for(int i=top;i>=0;i--)
		{
			
				System.out.print(stack[i]+" ");
				
		}
	}

	public static void main(String[] args)
	{
		RemoveTheParenthesis ob = new RemoveTheParenthesis();
	
		ob.push(5);
		ob.push(6);
		ob.push(7);
		ob.print();
		ob.pop();
		System.out.println("after pop");
		ob.print();
	}

}
