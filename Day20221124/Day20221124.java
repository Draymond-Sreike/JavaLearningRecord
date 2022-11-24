public class Day20221124
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("要计算的阶乘数：");
		int num = s.nextInt();
//		System.out.print("num = " + num);
//		int retFactorialValue = Day20221124.factorial(num);		// 完整的方法调用格式
//		int retFactorialValue = factorial(num);
		int retFactorialValue = Calculator.factorial(num);
		System.out.print(num + "的阶乘结果为：" + retFactorialValue);
	}
}