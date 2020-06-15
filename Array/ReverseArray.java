public class ReverseArray
{
   public static void main(String args[])
    {
     if(args.length!=4)
       System.out.println("Please enter 4 integer numbers");
     else
      {
      int arr[][]=new int[2][2];
       int b=0;
       System.out.println("The given array is :");
      for(int i=0;i<2;i++)
       {
          for(int j=0;j<2;j++)
           {
            arr[i][j]=Integer.parseInt(args[b]);
             System.out.print(arr[i][j]+" ");
            b++;
            }
           System.out.println("");
        }
       System.out.println("The reverse of the array is :");
       for(int i=1;i>=0;i--)
       {
          for(int j=1;j>=0;j--)
           {
               System.out.print(arr[i][j]+" ");
            }
           System.out.println("");
        }
      }
  }
}