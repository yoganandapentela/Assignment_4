import java.util.*;

public class program6 {

	public static void main(String[] args) {
		int b,count=0;
		System.out.println("Enter your Panagram String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		for(char i='a';i<='z';i++)
		{
			
			b=str.indexOf(i);

			if(b==-1)
			{
				System.out.println("Not a Panagram");
				break;
			}
			else
			{
				count++;
			}
		}
		if(count>=26)
		{
			System.out.println(" Panagram");

		}
    }

}
