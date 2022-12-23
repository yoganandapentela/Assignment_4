import java.util.*;

public class Program7 {

	public static void main(String[] args) {
        String str;
		boolean b=true;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		l:for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("The given string is not Unique");
					b=false;
					break l;

				}
			}
		}
		if(b)
		{
			System.out.println("String is Unique");

		}
	}

}
