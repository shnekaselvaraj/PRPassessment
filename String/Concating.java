
public class Concating {

	public static void main(String[] args) {
		String s1=args[0].toLowerCase();
		String s2=args[1].toLowerCase();
		char a=s1.charAt(s1.length()-1);
		char b=s2.charAt(0);
		if(a==b)
		{
			String ss=Character.toString(b);
			ss=s2.replaceFirst(ss,"");
			System.out.println(s1+ss);
		}
		else
		{
			System.out.println(s1+" "+s2);
		}
			
	}

}
