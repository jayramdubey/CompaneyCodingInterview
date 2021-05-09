package snapwiz;
import java.util.*;

 public class Heroes
   {
      public static void main(String[] args)
       {
            int n,k;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of n");
            n=sc.nextInt();
           if( !(n>=1 && n<=100))
            {
                 System.out.println("Enter Valid value of n (where n>=1 && n<=100)");
            }
                System.out.println("Enter value of k");
                 k=sc.nextInt();
        if(!(k>=1 && k<=10))
          {
             System.out.println("Enter Valid value of k(where k>=1 && k<=10)");
          }
        int sum=0;
        int G[]=new int[n];
        int count=0;
       for(int m=0;m<G.length;m++)
        {
          G[m]=sc.nextInt();
          sum=sum+G[m];	
       if(++count==k)
         break;
     }
          System.out.println(sum);
            int sumOfb=0;
          int B[]=new int[n];
           int flag=0;
        for(int i=0;i<B.length;i++)
         {
            B[i]=sc.nextInt();
            sumOfb=sumOfb+B[i];
           if(++flag==k)
              break;
             }
              System.out.println(sumOfb);
              if(sum>=sumOfb || sum<=sumOfb)
                 {
                      sum=sum>=sumOfb?sum/sumOfb:sumOfb/sum;
              if(sum==k)
                 {
                   System.out.println(sum);
                 }
           else
               {
                 System.out.println("-1");
                }
             } 
         }
}