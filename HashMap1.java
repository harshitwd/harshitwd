package thinkQ;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hashP = new HashMap<>();
		hashP.put(1,"hs");
		hashP.put(2,"abc");
		hashP.put(3,"def");
		hashP.put(4,"fij");
		
		Set<Entry<Integer, String>> set = hashP.entrySet();
		for(Map.Entry<Integer,String> a : set) {
			System.out.println(a.getKey() + " :" + a.getValue());
		}
		
		Set<Integer> n = hashP.keySet();
		for(int i : n) {
			System.out.println(i + " :" + hashP.get(i));
		}

	}

}
