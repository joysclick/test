
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

class TreeMapTest{
	
	public static void main(String[] args){
		Map<Integer, String> counts = new TreeMap<>();
		counts.put(4, "four");
		counts.put(1, "one");
		counts.put(3, "three");
		counts.put(2, "two");

		Iterator<Integer> keys = counts.keySet().iterator();

		//order does not change
		while (keys.hasNext()){
			System.out.println(keys.next());
		}
	}
}
