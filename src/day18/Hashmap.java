package day18;
import java.util.HashMap;

public class Hashmap {
	


	public static void main(String[] args) {
		
		HashMap<Integer,String> sd= new HashMap<>();
		sd.put(101, "aaa");
		sd.put(102, "bbb");
		sd.put(103, "ccc");
		
		System.out.println(sd);
		
		System.out.println(sd.keySet());
		System.out.println(sd.values());
		System.out.println(sd.entrySet());
		
		System.out.println(sd.containsKey(101));
		System.out.println(sd.containsKey(104));
		
		System.out.println(sd.containsValue("aaa"));
		System.out.println(sd.containsValue("AAA"));
		
		System.out.println(sd.size());
		sd.remove(101);
		sd.remove(101,"aaa");
System.out.println(sd);
		
		sd.put(102, "BBB");//new key it will add or if exist key replace
		
		System.out.println(sd);
		
		sd.replace(104, "ddd");//new key it will not add or if exist key replace
		
		
		sd.replace(102, "BBB", "abc");
		
		System.out.println(sd);
	}
}
//hashtable we can use null values
//otherthan that hashtable is similiar to hashmap



