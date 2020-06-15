public class MidElement
{
   public static void main(String args[])
    {
      int arr1[]=new int[3];
       int arr2[]=new int[3];
     
      // int ans[]=new int[arr.length];
      int count=0;
      int b=0;
      for(int i=0;i<3;i++)
           arr1[i]=Integer.parseInt(args[i]);
      for(int i=3;i<6;i++)
       {
           arr2[b]=Integer.parseInt(args[i]);
           b++;
       }
       int mid[]=new int[2];
       mid[0]=arr1[1];
       mid[1]=arr2[1];
       for(int i=0;i<mid.length;i++)
          System.out.print(mid[i]+" ");
  }
}