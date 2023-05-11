package practice;

import java.util.Scanner;


class Dectobinar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Sc=new Scanner(System.in);
		System.out.println("enetr decimal");
		int num=Sc.nextInt();
		int index=0;
		int arr[]=new int[10];
		while(num>0) {
			arr[index]=num%2;
			index++;
			num/=2;
		}
		System.out.println("binarynumis:");
		for(int i=index-1;i>=0;i--) {
			System.out.println(arr[i]);
			
		}
		

	}

}
 