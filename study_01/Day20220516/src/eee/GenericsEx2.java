package eee;

//class AppleBox {
//	private Apple ap;
//
//	public Apple getAp() {
//		return ap;
//	}
//
//	public void setAp(Apple ap) {
//		this.ap = ap;
//	}
//
//}
//
//class OrangeBox {
//	private Orange or;
//
//	public Orange getOr() {
//		return or;
//	}
//
//	public void setOr(Orange or) {
//		this.or = or;
//	}
//
//}

class Apple2 {
	@Override
	public String toString() {
		return "I'm apple";
	}
}

class Orange2 {
	@Override
	public String toString() {
		return "I'm orange";
	}
}

class Box2<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

}

public class GenericsEx2 {

	public static void main(String[] args) {
		Box2<Apple2> aBox = new Box2<Apple2>();
		
		Box2<Orange2> oBox = new Box2<Orange2>();
		
		aBox.setOb(new Apple2());
		oBox.setOb(new Orange2());
		
		Apple2 ap = aBox.getOb();
		Orange2 or = oBox.getOb();
		
		System.out.println(ap);
		System.out.println(or);
		
	}

}
