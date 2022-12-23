import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a String1");

		String str1=sc.nextLine();
		System.out.println(" Enter a String2");

		String str2=sc.nextLine();
		if(str1.length()!=str2.length())
		{
			System.out.println("Not a Ananagram");
		}
		else {
			str1=str1.toLowerCase();
			char[] c1=str1.toCharArray();
			Arrays.sort(c1);
			str2=str2.toLowerCase();
			char[] c2=str2.toCharArray();
			Arrays.sort(c2);
			if(Arrays.equals(c1,c2)) {
				System.out.println(" Ananagram");

			}
			else {
				System.out.println("Not a Ananagram");
			

			}
		}
	}

}
