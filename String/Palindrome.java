public class Palindrome {

	public static void main(String[] args) {
		String s=args[0];
		s=s.toLowerCase();
		StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();
        if(s1.contentEquals(s))
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not a Palindrome");
        }
	}

}
