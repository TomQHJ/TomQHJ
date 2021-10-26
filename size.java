
public class size {

	public static void main(String[] args) {
		int a=10,b=50;
		int c;  //中间变量
		
		//交换前的变量值
		System.out.println("交换前的变量值");
		System.out.println("a="+a+"\t"+"b="+b);
		
		//值的互换
		c=a;
		a=b;
		b=c;
		
		//交换后的变量值
		System.out.println("交换后的变量值：");
		System.out.println("a="+a+"\t"+"b="+b);
		

	}

}
