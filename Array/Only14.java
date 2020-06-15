public class Only14
{
   public static void main(String args[])
    {
      int arr[]=new int[args.length];
      // int ans[]=new int[arr.length];
      int count=0;
      for(int i=0;i<args.length;i++)
           arr[i]=Integer.parseInt(args[i]);
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i]!=1 && arr[i]!=4)
           count++;
     }
      if(count>0)
         System.out.println("false");
      else
       System.out.println("true");
   }
}