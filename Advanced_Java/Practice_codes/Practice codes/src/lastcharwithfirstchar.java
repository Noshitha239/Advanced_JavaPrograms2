import java.util.Scanner;

public class lastcharwithfirstchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:  ");
		String s=sc.next();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length()-1;i++) {
			if (c.length > 1 ) {
				char temp = c[0];
				c[0] = c[c.length - 1];
				c[c.length - 1] = temp;	
			} 
		}
		String s1=new String(c);
		System.out.println(s1);
	}

}


