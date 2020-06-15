public class TenToZero
{
  public static void main(String args[])
    {
      int arr[]=new int[args.length];
      int ans[]=new int[arr.length];
      int b=0;
      for(int i=0;i<args.length;i++)
      {
         arr[i]=Integer.parseInt(args[i]);
         if(arr[i]!=10)
           {
            ans[b]=arr[i];
            b++;
           }
      }
        for(int i=0;i<arr.length;i++)
          System.out.print(ans[i]+" ");
  }
}
       
          