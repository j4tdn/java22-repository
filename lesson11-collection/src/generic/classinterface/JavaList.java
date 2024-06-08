package generic.classinterface;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E> {

	private final int DEFAULT_CAPACITY = 4;
	
	// ko thể new generic type(tham số truyền vào lúc compile, xác định lúc compile)
	
	private E[] elements;
	private int size;
	
	public JavaList() {
		elements = createNewArray(DEFAULT_CAPACITY);
	}
	
	public JavaList(int capacity) {
		elements = createNewArray(capacity < 0 ? DEFAULT_CAPACITY : capacity);
	}
	
	@Override
	public E get(int pos) {
		return null;
	}

	@Override
	public void set(int pos, E e) {
		
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			elements = grow();
		}
		elements[size++] = e;
		return true;
	}
	
	private E[] grow() {
		E[] newElements = createNewArray(size + size/2);
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		return newElements;
	}

	@Override
	public boolean add(int pos, E e) {
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
	
	@Override
	public int getCapacity() {
		return elements.length;
	}
	
	@SuppressWarnings("unchecked")
	private E[] createNewArray(int length) {
		return (E[]) Array.newInstance(Object.class, length);
	}
	
	// nếu size = k, add tại vị trí k ok
	private void validateIndex(int index) {
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Index is invalid, require [" + 0 + ", " + size + "]");
		}
	}

}
