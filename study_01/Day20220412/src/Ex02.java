
public class Ex02 {

	public static void main(String[] args) {
		// �Լ����� �Է� o ��� x
		
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() �Լ�!!");
		
		sub(num, num2);
		
		System.out.println("main()2 �Լ�");
		

	}
	public static void sub (int i, int j) {
		System.out.println("�� �� ���� " + (i + j));
	}
}
