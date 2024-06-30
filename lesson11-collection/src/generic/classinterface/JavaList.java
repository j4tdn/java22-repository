package generic.classinterface;

import java.lang.reflect.Array;
import java.util.function.Consumer;

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
		if (pos < 0 || pos >= size) {
			throw new ArrayIndexOutOfBoundsException("Index " + pos + " out of bound[" + size + "] exception)");
		}
		return elements[pos];
	}

	@Override
	public void set(int pos, E newValue) {
		if (pos < 0 || pos >= size) {
			throw new ArrayIndexOutOfBoundsException("Index " + pos + " out of bound[" + size + "] exception)");
		}
		elements[pos] = newValue;
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			elements = grow();
		}
		elements[size++] = e;
		return true;
	}

	// [a, b, c, d]
	// [a, b, c, d, null, null]

	private E[] grow() {
		E[] newElements = createNewArray(size + size / 2);
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
		return size == 0;
	}

	@Override
	public int getCapacity() {
		return elements.length;
	}

	/**
	 * hàm forEach 100% khi gọi là chỉ lấy từng phần tử rồi in ra
	 * 
	 * thực tế có thể for lấy từng phần tử, sử dụng phần tử đó đi xử lý tính toán
	 */
	
	@Override
	public void forEach(Consumer<E> consumer) {
		for(int i = 0; i < size; i++) {
			consumer.accept(elements[i]);
		}
	}
	
	@SuppressWarnings("unchecked")
	private E[] createNewArray(int length) {
		return (E[]) Array.newInstance(Object.class, length);
	}

}