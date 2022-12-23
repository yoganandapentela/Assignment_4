import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		String str;
		char str1[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
			
		{
			char c=str.charAt(i);
			int j=str.indexOf(c,i+1);
			if(j==-1)
			{
				sb.append(c);
			}
			
		}
		System.out.println("String after removing Duplicates is:"+"  "+sb);
		
	}

}
