public class Rearrange
{
   public static void main(String args[])
    {
      int arr[]=new int[args.length];
       int ans[]=new int[arr.length];
      for(int i=0;i<args.length;i++)
           arr[i]=Integer.parseInt(args[i]);
      int b=0;
      for(int i=0;i<arr.length;i++)
       {
         if(arr[i]%2==0)
                {
         	  ans[b]=arr[i];
                  b++;
                 }
         }
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]%2!=0)
                {
         	  ans[b]=arr[i];
                  b++;
                 }
         }
         for(int i=0;i<arr.length;i++)
           System.out.print(ans[i]+" ");
 }
}