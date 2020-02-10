import java.util.HashMap;

public class HashMapIterator implements Iterator{
	private HashMap collection;
	private int position;

	public HashMapIterator(HashMap newCollection){
		collection = newCollection;
		position = 0;

	}

	@Override
	public boolean hasNext() {
		if (position >= collection.size()){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		Object[] values = collection.values().toArray();
		Object value = values[position];
		position = position + 1;
		return value;
	}
}
