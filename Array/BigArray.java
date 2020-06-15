public class BigArray
{
   public static void main(String args[])
    {
     if(args.length!=9)
       System.out.println("Please enter 9 integer numbers");
     else
      {
      int arr[][]=new int[3][3];
      int b=0;
      int max=0;
       System.out.println("The given array is :");
      for(int i=0;i<arr.length;i++)
       {
          for(int j=0;j<arr[i].length;j++)
           {
            arr[i][j]=Integer.parseInt(args[b]);
            System.out.print(arr[i][j]+" ");
            b++;
            if(i==0 && j==0)
              max=arr[i][j];
            else
            {
              if(arr[i][j]>max)
                  max=arr[i][j];
            }
           }
           System.out.println("");
        }
          System.out.println("The biggest number in the given array is "+max);
     }
  }
}