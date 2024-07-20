package functional;

@FunctionalInterface
public interface QuadFuntion<T, U, M, N, R> {
	R apply(T t, U u, M m, N n);
}
