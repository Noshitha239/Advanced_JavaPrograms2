import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        int flag=0;
        if(n<2) {
        	System.out.println(n+" is not a prime number");
        }
        for(int i=1;i<=n;i++){
        	if(n%i==0) {
        		flag++;	
        	}   	
        }
        if(flag==2) {
        	System.out.println(n+" is a prime number");
        }
        else {
        	System.out.println("not prime");
        }
	}
}
