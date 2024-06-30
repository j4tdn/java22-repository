package generic.classinterface;

import java.util.function.Consumer;

public interface IList<E> {
	
	E get(int pos);
	
	void set(int pos, E newValue);

	boolean add(E e);
	
	boolean add(int pos, E newValue);
	
	int size();
	
	boolean isEmpty();
	
	int getCapacity();
	
	void forEach(Consumer<E> consumer);
}
