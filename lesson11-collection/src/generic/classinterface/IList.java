package generic.classinterface;

public interface IList<E> {

	E get(int pos);

	void set(int pos, E e);

	boolean add(E e);

	boolean add(int pos, E e);

	int size();

	boolean isEmpty();
	
	int getCapacity();

}
