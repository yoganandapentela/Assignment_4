import java.util.*;
public class Program8 {

	public static void main(String[] args) {
	     String str;
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	     int[] count=new int[str.length()];
	     char[] ch=str.toCharArray();
	     for(int i=0;i<str.length();i++)
	     {
	    	
	    	 for(int j=i+1;j<str.length();j++)
	    	 {
	    		 if(ch[i]==ch[j] && ch[i]!=' ')
	    		 {
	    			 count[i]++;
	    			 
	    		 }
	    		 
	    	}
		     //System.out.print(count[i]);

	     }
	     int max=count[0];
	     int temp=0;
	     int index=0;
	     for(int k=0;k<count.length;k++)
	     {
	    	if(max<count[k])
	    	{
	    		temp=count[k];
	    		count[k]=max;
	    		max=temp;
	    		index=k;	
	    	}
	     }
	     System.out.println(ch[index]+" is most occured "+(max+1)+" times  ");
	     }
}
