//���߱�������Scanner���ĸ�λ��
import java.util.Scanner;

public class Force {

	public static void main(String[] args) {
		double a;
		//����Scanner
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		//����a��ֵ
		System.out.println("������a��ֵ��");
		a=scanner.nextDouble();
		float n=(float)a;
		int c=(int) a;
		byte d=(byte)a;
		double sum=a+n+c+d;
		System.out.println(sum);

	}

}
