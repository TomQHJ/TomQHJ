//告诉编译器，Scanner在哪个位置
import java.util.Scanner;

public class Force {

	public static void main(String[] args) {
		double a;
		//创建Scanner
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		//接收a的值
		System.out.println("请输入a的值：");
		a=scanner.nextDouble();
		float n=(float)a;
		int c=(int) a;
		byte d=(byte)a;
		double sum=a+n+c+d;
		System.out.println(sum);

	}

}
