package day10;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in);
		System.out.println("enter first range");
		int a= Scan.nextInt();
		System.out.println("enter last range");
		//@SuppressWarnings("unused")
		int last=Scan.nextInt();
		System.out.println("enter table number");
		int table=Scan.nextInt();
		while(a<=last) {
			System.out.println(a+"X"+table+"="+a*table);
			a++;
		}
		Scan.close();;

	}

}
