
public class Ex04 {

	public static void main(String[] args) {
		// �Լ����� �Է� o ��� o
		
		System.out.println("main() �Լ�!!");
		int n = 5;
		int n2 = 10;
		int result = sub(n, n2);
		
		System.out.println("��� ���� " + result);
		
	}
	
	
	public static int sub(int i, int j) {
		System.out.println("sub() �Լ�...");
		return (i * j);

	}

}
