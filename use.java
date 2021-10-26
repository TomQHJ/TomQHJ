import java.util.Scanner;


public class use {

	public static void main(String[] args) {
		String str1="admin";//账户名
		String str2="123456";//密码
		//创建Scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String str3=sc.next();
		System.out.print("请输入密码：");
		String str4=sc.next();
		
		if(str3.equals(str1)&&str4.equals(str2)){
			System.out.println("登录成功");
		}else{
			System.out.println("您的输入有误，请重新输入");
		}
		
	
	}

}
