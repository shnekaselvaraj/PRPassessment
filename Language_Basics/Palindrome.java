public class Palindrome {

	public static void main(String[] args) {
		String input=args[0];
		StringBuffer sb=new StringBuffer(input);
		String rev=sb.reverse().toString();
		if(input.equals(rev))
			System.out.println(input+" is  a palindrome");
		else
			System.out.println(input+" is not a palindrome");
	}

}
