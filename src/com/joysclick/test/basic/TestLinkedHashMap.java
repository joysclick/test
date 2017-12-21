
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

class TestLinkedHashMap{
	
	public static void main(String[] args){
		Map<Integer, String> counts = new LinkedHashMap<>();
		counts.put(4, "four");
		counts.put(1, "one");
		counts.put(3, "three");
		counts.put(2, "two");

		Iterator<Integer> keys = counts.keySet().iterator();

		//same order as insert
		while (keys.hasNext()){
			System.out.println(keys.next());
		}
	}
}
