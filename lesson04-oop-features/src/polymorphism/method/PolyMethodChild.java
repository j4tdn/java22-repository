package polymorphism.method;

public class PolyMethodChild extends PolyMethodParent{
	@Override
	void log() {
		System.out.println("Child --> Log 2");
	}
}
