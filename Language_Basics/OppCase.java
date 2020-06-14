public class OppCase {
	public static void main(String[] args) {
		     char c=args[0].charAt(0);
		     int i=(int)c;
		      if((i>=65 && i<=90) )
		      {
		    	  i=i+32;
		    	  char ch=(char)i;
		       System.out.println(ch);
		      }
		     else   //|| (i>=97 && i<=112)
		     {
		    	 i=i-32;
		    	 char ch=(char) i;
		        System.out.println(ch);
		     } 
	}

}
