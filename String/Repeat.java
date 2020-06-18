
public class Repeat {

	public static void main(String[] args) {
		String input=args[0];
		int n=Integer.parseInt(args[1]);
		int l=input.length()-n;
		String s=input.substring(input.length()-l-1,input.length());
		while(n>0)
		{
			System.out.print(s);
			n--;
		}

	}

}
