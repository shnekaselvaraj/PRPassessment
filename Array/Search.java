public class Search
{
  public static void main(String args[])
   {
    int arr[]={1,4,34,56,7};
    int flag=0;
    int num=Integer.parseInt(args[0]);
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==num)
       {
         System.out.println("index "+i);
         flag=1;
       }
   }
   if(flag==0)
    System.out.println("-1");
    }
}