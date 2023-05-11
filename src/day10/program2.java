package day10;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
	System.out.println("enter the number");	
	int a=Scan.nextInt();
	System.out.println("enter lastnumber");
	int last=Scan.nextInt();
	System.out.println("enter the x ");
	int x= Scan.nextInt();
	while(a<=last) {
		if(a%x==0) {
			System.out.println(a);
		}
		a=a+1;
	}
	Scan.close();


	}
	

}
