
public class Ex01 {

	public static void main(String[] args) {
		// �Լ����� �Է� x ��� x
		System.out.println("main() �Լ�!!");
		sub2();  //�Լ� ȣ��
		
	}
	// �Լ��� �����ϸ� �ݵ�� �ٸ� ��(main���) ȣ���� �ؾ��Ѵ�.
	public static void sub() {
		System.out.println("���� �Լ� �Դϴ�.");
	}
	public static void sub2() {
		sub();
	}
}
