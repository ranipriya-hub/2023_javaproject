package practice;

import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter binary");
		int bin=Scan.nextInt();
		int dec=0;
		int i=1,rem;
		while(bin!=0) {
			rem=bin%10;
			dec=dec+rem*i;
			
			//bin=bin/10;
		i=	i*2;
			bin=bin/10;
			
		}
		System.out.println(dec);
	}
	}


