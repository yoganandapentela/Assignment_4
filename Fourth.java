import java.util.*;
public class Fourth {

	public static void main(String[] args) {
	 int vowels=0,consonants=0,sp=0,digits=0;
	 String str;
	 System.out.println("Enter your String");
	 Scanner sc=new Scanner(System.in);
	 str=sc.nextLine();
	 str=str.toLowerCase();
	 char[] ch=str.toCharArray();
	 for(int i=0;i<ch.length;i++)
	 {
		 if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
		 {
			 ++vowels;
		 }
		 else if(ch[i]>='a' && ch[i]<='z')
		 {
			 ++consonants;
		 }
		 else if(ch[i]>='0' && ch[i] <='9')
		 {
			 ++digits;
		 }
		 else if(ch[i]==' ')
		 {
			 
		 }
		 else {
			 ++sp;
		 }
	 }
	 System.out.println("Vowels:"+vowels+"\n"+"Consonants:"+consonants+"\n"+"Digits:"+digits+"\n"+"Special Characters:"+sp);

	}

}
