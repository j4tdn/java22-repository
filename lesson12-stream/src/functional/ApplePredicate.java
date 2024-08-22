package functional;
import bean.Apple;

@FunctionalInterface
public interface ApplePredicate {
	public boolean test(Apple a);
}
