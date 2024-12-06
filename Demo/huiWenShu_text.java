//回文数

import java.util.Scanner;
public class huiWenShu_test{
	public static void main(String[] args){
		
		System.out.println("请输入一个数字：");//打印文字
		Scanner sc = new Scanner(System.in);//创建扫描仪对象
		int inputNum = sc.nextInt();//接收扫描仪到的数据
		int temp = inputNum;//把输入的数字存到临时变量temp中
		int num = 0;//定义变量num存回文数
		//123
		while(inputNum!=0){
			int ge = inputNum%10;//获取输入的数字每一位数字
			inputNum = inputNum / 10;
			num = num *10+ge;//获取回文数
			
		}
			System.out.println(temp==num);//判断是否相等，是否为回文数
	}
}