package test;
import java.util.*;
public class swap {

	public static void main(String[] args) {
		int x, y, temp;
		 System.out.println("Enter x and y");
		 @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		 x = in.nextInt();
		 y = in.nextInt();
		System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		 temp = x;
		 x = y;
		 y = temp;
		 System.out.println("After Swapping\nx = "+x+"\ny = "+y);

	}

}
