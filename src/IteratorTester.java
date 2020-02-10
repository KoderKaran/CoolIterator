import java.util.ArrayList;
import java.util.HashMap;

public class IteratorTester {
	public static void main(String[] args){
		HashMap<Integer, String> intToStringHashMap = new HashMap<>();
		intToStringHashMap.put(0, "This is");
		intToStringHashMap.put(1, "My Hashmap");
		intToStringHashMap.put(2, "Iterator!");

		String[] stringArray = new String[3];
		stringArray[0] = "This is";
		stringArray[1] = "My Array";
		stringArray[2] = "Iterator!";

		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add("This is");
		stringArrayList.add("My Arraylist");
		stringArrayList.add("Iterator!");

		IteratorGetter iteratorGetter = new IteratorGetter(intToStringHashMap);
		IteratorGetter iteratorGetter2 = new IteratorGetter(stringArray);
		IteratorGetter iteratorGetter3 = new IteratorGetter(stringArrayList);

		iteratorGetter.printCollection();
		System.out.println("--------------------");
		iteratorGetter2.printCollection();
		System.out.println("--------------------");
		iteratorGetter3.printCollection();
	}
}
