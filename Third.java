
public class Third {

	public static void main(String[] args) {
		String s1="2552",s2="";
		char [] c1=s1.toCharArray();
		for(int i=c1.length-1;i>=0;i--)
		{
			s2=s2+c1[i];
		}

		if(s1.equals(s2))
		{
			System.out.println("Given String is a Palindrome"+"  "+s2);
		}

	}

}
