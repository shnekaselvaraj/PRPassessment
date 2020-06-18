
public class RemoveStar {
	public static void main(String[] args) {
		String s=args[0];
		char arr[]=s.toCharArray();
		if(s.contains("*") || s.contains("-"))
		{
			int i=s.indexOf("*");
			for(int j=0;j<arr.length;j++)
			{
				if(j==i || j==i-1 || j==i+1)
					continue;
				else
					System.out.print(arr[j]);
			}
		}
	}

}
