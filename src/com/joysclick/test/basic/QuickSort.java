import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class  QuickSort
{
	public static Integer[] arr = {8, 5, 1, 9, 77, 2, 4, 7};

	public static List<Integer> sort(List<Integer> list){
		if (list.size() < 2)
		{
			return list;
		}

		Integer pivot = list.get(0);

		List<Integer> lower = new ArrayList<>();
		List<Integer> higher = new ArrayList<>();

		for(int i=1; i<list.size(); i++){
			if (list.get(i) < pivot)
			{
				lower.add(list.get(i));

			}else{
				higher.add(list.get(i));
			}
		}

		List<Integer> sorted = sort(lower);
		sorted.add(pivot);
		sorted.addAll(sort(higher));

		return sorted;
	}

	public static void printArray(Integer[] arr){
		String s = "{";
		for(int i=0; i<arr.length; i++){
			if (i != arr.length-1)
			{
				s += arr[i] + ", ";
			}else{
				s += arr[i] + "}";
			}
		}
		System.out.println(s);
	}


	public static void printList(List<Integer> list){
		String s = "{";
		for(int i=0; i<list.size(); i++){
			if (i != list.size()-1)
			{
				s += list.get(i) + ", ";
			}else{
				s += list.get(i) + "}";
			}
		}
		System.out.println(s);
	}


	public static void main(String[] args) 
	{
		printArray(arr);
		List<Integer> sortedArr = sort(Arrays.asList(arr));
		printList(sortedArr);
	}
}
