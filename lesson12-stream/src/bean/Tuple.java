package bean;

public class Tuple<T1, T2> {
	
	private T1 t1;
	private T2 t2;
	
	public Tuple(T1 t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public T1 getT1() {
		return t1;
	}
	
	public Tuple<T1, T2> withT1(T1 t1) {
		this.t1 = t1;
		return this;
	}
	
	public T2 getT2() {
		return t2;
	}
	
	public Tuple<T1, T2> withT2(T2 t2) {
		this.t2 = t2;
		return this;
	}
	
	@Override
	public String toString() {
		return "Tuple(" + t1 + ", " + t2 + ")";
	}
	
}