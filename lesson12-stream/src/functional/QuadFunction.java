package functional;

public interface  QuadFunction<T, U, M, N ,R> {
	
	R apply(T t , U u, M m, N n);

}
