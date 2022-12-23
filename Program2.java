import java.util.Scanner;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]='0';  //to avoid the repition visiting of character and keeping it to '0' char and we are not taking '0' char in comparing in below if condition.
				}
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
			
		}
		

		
	}

}
