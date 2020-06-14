public class Pattern
{
  public static void main(String args[])
   {
     if(args.length==0)
       System.out.println("Please enter an integer number");
     else
      {
       int num=Integer.parseInt(args[0]);
        int n=1;
      while(n<=num)
      
      { 
           for(int i=1;i<=n;i++)
             System.out.print("* ");
            System.out.println("");
           n=n+1;
       }
       }
   }
}
