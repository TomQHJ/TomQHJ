//告诉编译器，Scanner在哪个位置
import java.util.Scanner;

public class TransFormation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		float c;
		double d;
		
		//创建Scanner
		Scanner scanner=new Scanner(System.in);
		//接收n的值
		System.out.println("请输入n的值：");
		n=scanner.nextInt();
		//接收c的值
		System.out.println("请输入c的值：");
		c=scanner.nextFloat();
		//接收d的值
		System.out.println("请输入d的值：");
		d=scanner.nextDouble();
		int sum=(int) (n+c+d);
		System.out.println(sum);
		

	}

}
