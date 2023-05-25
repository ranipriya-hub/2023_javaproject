package practice;

import java.util.Scanner;

public class Reversenumber { 

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Sc.nextInt();
		Sc.close();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10; //1234 4321
			num/=10;
		}
		System.out.println(+rev);
	}

}
