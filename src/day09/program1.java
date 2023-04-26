package day09;
import java.util.jar.*; 
public class program1 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the mobile brand");
		String brand=Scan.next();
		int price;
		String colour;
		if(brand.equals("apple")) {
			System.out.println("enter apple mobile price range:");
			price=Scan.nextInt();
			if(price>=50000 && price<=150000) {
				System.out.println("enter mobile colour");
				colour=Scan.next();
				if(colour.equals("red")||colour.equals("silver")){
					System.out.println("applemobile isavailable");
				}
			}
				else {
					System.out.println("applemobileisnotavailble");
					
				}
	
					
				}
		else if(brand.equals("oppo")) {
			System.out.println("enter mobile pricre range");
			price=Scan.nextInt();
			if(price>=15000 && price<=120000) {
				System.out.println("entermobilecolour");
				colour =Scan.next();
				if(colour.equals("red")||colour.equals("silver")) {
					System.out.println("opp availnle");
				}
				else {
					System.out.println("opponoavailble");
				}
			}
				
			}
		}
		
	}


