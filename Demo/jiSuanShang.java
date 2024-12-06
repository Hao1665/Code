//不用乘除取模，计算出来两数的商和余数
import java.util.Scanner;
public class jiSuanShang{
	public static void main(String[] args){
		int a = 188,b=2;
		int c =0;
		while(a-b>=0){
		a=a-b;
		c++;
		}
		System.out.println("商：" + c);
		if(a!=0){
		System.out.println("余数：" + a);	
		}
		
	}
}