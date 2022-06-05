package GmethodEx4;

class Box<T> {
	private T ob;
	
	public void set(T o) { ob = o; }
	public T get() { return ob; }
}

class BoxFactory {
	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T tmp;
		tmp = box1.get();
		box1.set(box2.get());
		box2.set(tmp);
	}
}


public class GenericMethodBox {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println("before : " + box1.get() + " & " + box2.get());
		
		BoxFactory.swapBox(box1, box2);
		
		System.out.println("after : " + box1.get() + " & " + box2.get());
		
	}
}
