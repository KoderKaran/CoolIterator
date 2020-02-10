public class ArrayIterator implements Iterator{
	private Object[] collection;
	private int position;

	public ArrayIterator(Object[] newCollection){
		collection = newCollection;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if (position >= collection.length || collection[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Object obj = collection[position];
		position = position + 1;
		return obj;
	}
}
