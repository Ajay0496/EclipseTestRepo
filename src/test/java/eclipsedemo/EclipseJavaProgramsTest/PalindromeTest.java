package eclipsedemo.EclipseJavaProgramsTest;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		}
		if(n==j) {
		System.out.println("It is panlidrome");
		}
		else {
		System.out.println("It is not a panlindrome");
		}

	}

}
