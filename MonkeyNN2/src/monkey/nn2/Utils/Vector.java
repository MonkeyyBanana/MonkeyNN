package monkey.nn2.Utils;

public class Vector<T> extends Shape<T> {
	private static final long serialVersionUID = -5230525396714452759L;
	
	private T[] vector;
	
	public Vector(T[] vector) {
		this.vector = vector;
	}
	
	public Vector(int[] size) {
		vector = (T[]) new Object[size[0]];
	}

	@Override
	public int[] getSize() {
		return new int[] {vector.length};
	}

	@Override
	public T get(int[] pos) {
		return vector[pos[0]];
	}

	@Override
	public void set(int[] pos, Object value) {
		vector[pos[0]] = (T)value;
	}

	public T[] dump() {
		return vector;
	}
}
