//���߱�������Scanner���ĸ�λ��
import java.util.Scanner;

public class TransFormation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		float c;
		double d;
		
		//����Scanner
		Scanner scanner=new Scanner(System.in);
		//����n��ֵ
		System.out.println("������n��ֵ��");
		n=scanner.nextInt();
		//����c��ֵ
		System.out.println("������c��ֵ��");
		c=scanner.nextFloat();
		//����d��ֵ
		System.out.println("������d��ֵ��");
		d=scanner.nextDouble();
		int sum=(int) (n+c+d);
		System.out.println(sum);
		

	}

}
