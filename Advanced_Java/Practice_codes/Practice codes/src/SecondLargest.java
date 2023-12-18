import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int seclarge=a[0];
		int max=a[0];
        for(int i=0;i<a.length;i++) {
        	
        	if(a[i]>max) {
        		seclarge=max;
        		max=a[i];	
        	}
        	else if(a[i]!=max && a[i]>seclarge){
        		seclarge=a[i];
        	}
        }
        System.out.println(seclarge);
        System.out.println(max);
	}

}
