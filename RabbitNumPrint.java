package eg;

//引入scanner函数，进行输入操作
import java.util.Scanner;
//声明此类RabbitNumPrint，见名知意
public class RabbitNumPrint {
	
	//进入Java主函数
	public static void main(String[] args) {
		//提示语句
		System.out.print("请输入需月份:");
		//引用对象
		Scanner sc = new Scanner(System.in);
		//定义整型n调用nextInt方法
		int n = sc.nextInt();
		//输出语句
		System.out.println("第" + n + "个月兔子总数为：" + fun(n));
		
	}

//定义整型方法，递归调用
private static int fun(int n) {
	//如果n为1或2时，返回1
	if(n == 1||n == 2)
		return 1;
	//否则返回递归的值
	else
		return fun(n - 1) + fun(n - 2);
	
}
	

}
