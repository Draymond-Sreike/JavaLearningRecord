public class Day20221124
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("Ҫ����Ľ׳�����");
		int num = s.nextInt();
//		System.out.print("num = " + num);
//		int retFactorialValue = Day20221124.factorial(num);		// �����ķ������ø�ʽ
//		int retFactorialValue = factorial(num);
		int retFactorialValue = Calculator.factorial(num);
		System.out.print(num + "�Ľ׳˽��Ϊ��" + retFactorialValue);
	}
}