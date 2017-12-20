import java.util.List;
import java.util.LinkedList;

public class  InsertSort
{
	public static int[] arr = {8, 5, 1, 9, 77, 2, 4, 7};

	public static List<Integer> sort(int[] arr){
		List<Integer> sortedList = new LinkedList<>(); 

		originalList: for(int number : arr){
			System.out.println("number: " + number);
			for(int i=0; i<sortedList.size(); i++){
				if (number < sortedList.get(i))
				{
					System.out.println("Index: " + i + " Add number: " + number);
					sortedList.add(i, number);
					printList(sortedList);
					continue originalList;
					
					//break;
				}
			}
			sortedList.add(sortedList.size(), number);
			printList(sortedList);
		}

		return sortedList;
	}

	public static void printArray(int[] arr){
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
		List<Integer> sortedArr = sort(arr);
		printList(sortedArr);
	}
}
