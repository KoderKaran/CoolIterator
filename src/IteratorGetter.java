import java.util.ArrayList;
import java.util.HashMap;

public class IteratorGetter {
	private Iterator iterator;

	public IteratorGetter(Object collection){
		if(collection.getClass().isArray()){
			iterator = new ArrayIterator((Object[]) collection);
		}else if(collection instanceof HashMap){
			iterator = new HashMapIterator((HashMap) collection);
		}else if(collection instanceof ArrayList) {
			iterator = new ArrayListIterator((ArrayList) collection);
		}else{
			System.out.println("This collection is not supported!");
		}
	}

	public void printCollection(){
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
