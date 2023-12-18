import java.util.Scanner;

public class removeDuplicateCharactersinArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int r=0;
        char ar[]= {'a','a','b','c','e','e'};
        for(int i=1;i<ar.length;i++) {
        	if(ar[r]!=ar[i]) {
        		r++;
        		ar[r]=ar[i];
        	}
        }
        for(int i=0;i<=r;i++) {
        	System.out.println(ar[i]);
        }
	}

}
