public class Alternate {
	public static void main(String[] args) {
		String input1=args[0];
		String input2=args[1];
		char arr1[]=input1.toCharArray();
		char arr2[]=input2.toCharArray();
		int min,max;
		if(input1.length()>=input2.length())
		{
		min=input2.length();
		max=input1.length();
		}
		else
		{
			min=input1.length();
			max=input2.length();
		}
		for(int i=0;i<min;i++) {
			System.out.print(arr1[i]);
		System.out.print(arr2[i]);
		}
		if(max-min!=0)
		{
			int a=max-min;
			for(int i=max-a;i<max;i++)
			{
				if(max==input1.length())
					System.out.print(arr1[i]);
				else
					System.out.print(arr2[i]);
			}
		}

	}

}
