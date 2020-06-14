public class PrimeRange
{
   public static void main(String args[])
   {
     for(int i=10;i<=99;i++)
     {
       int m=i/2;
       int count=0;
       for(int j=2;j<=m;j++)
        {
           if(i%j==0)
	     count++;
        }
	  if(count==0)
		System.out.println(i);
     }
   }
}