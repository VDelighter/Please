import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int num = sc.nextInt();
			sub(num);
			System.out.println("���α׷� ����!!");
		}
		
		
	}
	
	public static void sub(int n) {
		System.out.println("�Է��� " + n + "�� ���");
		
		for (int i = 1; i <= 9; i++)
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
	}
}
