public class  BubbleSort
{
	public static int[] arr = {8, 5, 1, 9, 77, 2, 4, 7};

	public static int[] sort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		return arr;
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

	public static void main(String[] args) 
	{
		printArray(arr);
		int[] sortedArr = sort(arr);
		printArray(sortedArr);
	}
}
