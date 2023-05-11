package day11;
import java.util.*;

public class program1 {



	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the n");
		int n=Scan.nextInt();
		System.out.println("enter a");
 int a = Scan.nextInt();
 System.out.println("result");
 int result= Scan.nextInt();
 while(a<=n) {
  result=result*a;
		System.out.println(+a+ "   " +result);
		a++;

	}

}
}
