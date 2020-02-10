import java.util.ArrayList;

public class ArrayListIterator implements Iterator{
	private ArrayList collection;
	private int position;

	public ArrayListIterator(ArrayList newCollection){
		collection = newCollection;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if (position >= collection.size() || collection.get(position) == null) {
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		Object obj = collection.get(position);
		position = position + 1;
		return obj;
	}
}
