public class HasCommandLine
{
   public static void main(String args[])
   {
     int len=args.length;
     if(args.length==0)
       System.out.println("no values");
     else 
       {
        for(int i=0;i<args.length;i++)
         {
            if(i==0)
              System.out.print(args[i]);
            else 
              System.out.print(","+args[i]);
         }
       }
   }
}