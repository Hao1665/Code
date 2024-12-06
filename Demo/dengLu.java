import java.util.Scanner;

public class dengLu{
	
	public static void main(String[] args){
		
		
		//声明账号密码
		String zhang_Hao = "123";
		String mi_Ma = "123";
		Scanner sc = new Scanner(System.in);
		
		
		//提示
		System.out.println("请输入管理员账号密码");
		//用户输入账号
		System.out.print("账号：");
		String shu_Ru_Zhang_Hao = sc.next();
		//用户输入密码
		System.out.print("密码：");
		String shu_Ru_Mi_Ma = sc.next();
		//判断用户输入的账号密码是否正确，正确就继续执行，错误则结束
		if(shu_Ru_Zhang_Hao.equals("123") && shu_Ru_Mi_Ma.equals("123")){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("* * * * * * * 用户信息录入系统 * * * * * *");
			System.out.println("*\t\t\t\t\t *");
			//用户输入名字
			System.out.print("* 请输入你的名字:\t\t\t *");
			System.out.print("\r\t\t"+"：");
			String user_Name = scanner.next();
			//用户输入年龄
			System.out.print("* 请输入你的年龄:\t\t\t *");
			System.out.print("\r\t\t"+"：");
			int user_Age = scanner.nextInt();
			//用户输入性别
			System.out.print("* 请输入你的性别:\t\t\t *");
			System.out.print("\r\t\t"+"：");
			char user_Sex = scanner.next().charAt(0);
			//文本已保存
			System.out.println("*\t\t\t\t\t *");
			System.out.println("* 已保存您的信息！\t\t\t *");
			
			
			
			
			
			
			//最后二行
			System.out.println("*\t\t\t\t\t *");
			System.out.println("* * * * * * * * * * 嘻嘻 * * * * * * * * *");
			
			}
		else {
			System.out.println("账号或密码输入错误");
			System.exit(0);
			
		}
		
	}
}