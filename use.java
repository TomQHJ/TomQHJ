import java.util.Scanner;


public class use {

	public static void main(String[] args) {
		String str1="admin";//�˻���
		String str2="123456";//����
		//����Scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("�������û�����");
		String str3=sc.next();
		System.out.print("���������룺");
		String str4=sc.next();
		
		if(str3.equals(str1)&&str4.equals(str2)){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("����������������������");
		}
		
	
	}

}
