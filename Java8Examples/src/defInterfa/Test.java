package defInterfa;

@FunctionalInterface
public interface Test {

	public void ok();
	
	default void subtract() {
		System.out.println("Hello Test");
	};
	
	static void add() {
		System.out.println("How to Add Two Numbers");
	}
}
