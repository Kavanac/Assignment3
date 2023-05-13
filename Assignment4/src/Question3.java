import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		String s1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");	
		s1=scan.next();
		int m=s1.length();
		char org[]=new char[m];
		char rev[]=new char[m];
		
		for(int i=0;i<=s1.length()-1;i++) {
			org[i]=s1.charAt(i);
		}
		int i,j;
		i=m-1;
		j=0;
		while(i>=0) {
			rev[j]=org[i];
			i--;
			j++;
		}
		boolean status;
		status=Arrays.equals(org, rev);
		if(status==true) {
			System.out.println("String is a plaindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}

	}

}
