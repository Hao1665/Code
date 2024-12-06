import java.util.Scanner;

public class jinZhiZhuanHuan{
	
	public static void main(String[] args){
		System.out.println("输入任意字符开始\n输入end退出");
		Scanner scanner = new Scanner(System.in);
		String end = scanner.next();
		
		
		if (end.equals("end")) {
			
			System.exit(0);
		}else{
			while (true) {
			
			
		//提示用户输入一个十进制的数
		System.out.println();
		System.out.println("请输入一个十进制的数字：");
		//创建扫描仪
		Scanner sc = new Scanner(System.in);
		//接收输入的数字
		int number = sc.nextInt();
		
		
		//二进制
		int binNumber1 = number%2; //计算输入的数字除以2的余数
		int bin_Number1 = number/2;//计算输入的数字除以2的商
		
		
		int binNumber2 = bin_Number1%2;//计算第一次计算的商除以2的余数
		int bin_Number2 = bin_Number1/2;//计算第一次计算的商除以2的商
		
		
		int binNumber3 = bin_Number2%2;//计算第二次计算的商除以2的余数
		int bin_Number3 = bin_Number2/2;//计算第二次计算的商除以2的商
		
		
		int binNumber4 = bin_Number3%2;//计算第三次计算的商除以2的余数
		int bin_Number4 = bin_Number3/2;//计算第三次计算的商除以2的商
	
		
		int binNumber5 = bin_Number4%2;//计算第四次计算的商除以2的余数
		int bin_Number5 = bin_Number4/2;//计算第四次计算的商除以2的商

		int binNumber6 = bin_Number5%2;//计算第四次计算的商除以2的余数
		int bin_Number6 = bin_Number5/2;//计算第四次计算的商除以2的商

		int binNumber7 = bin_Number6%2;//计算第五次计算的商除以2的余数
		int bin_Number7 = bin_Number6/2;//计算第五次计算的商除以2的商

		int binNumber8 = bin_Number7%2;//计算第六次计算的商除以2的余数
		int bin_Number8 = bin_Number7/2;//计算第六次计算的商除以2的商

		System.out.println();
		System.out.println("第三行反着拼是十六进制数值");
		System.out.println("二进制：" + binNumber8 + binNumber7 + binNumber6 + binNumber5 + binNumber4 + binNumber3 + binNumber2 + binNumber1);
		
		
		//八进制
		
		int oNumber1 = number%8; //计算输入的数字除以8的余数
		int o_Number1 = number/8;//计算输入的数字除以8的商
		
		
		int oNumber2 = o_Number1%8;//计算第一次计算的商除以8的余数
		int o_Number2 = o_Number1/8;//计算第一次计算的商除以8的商
		
		
		int oNumber3 = o_Number2%8;//计算第二次计算的商除以8的余数
		int o_Number3 = o_Number2/8;//计算第二次计算的商除以8的商
		
		
		int oNumber4 = o_Number3%8;//计算第三次计算的商除以8的余数
		int o_Number4 = o_Number3/8;//计算第三次计算的商除以8的商
	
		
		int oNumber5 = o_Number4%8;//计算第四次计算的商除以8的余数
		int o_Number5 = o_Number4/8;//计算第四次计算的商除以8的商

		int oNumber6 = o_Number5%8;//计算第四次计算的商除以8的余数
		int o_Number6 = o_Number5/8;//计算第四次计算的商除以8的商

		int oNumber7 = o_Number6%8;//计算第五次计算的商除以8的余数
		int o_Number7 = o_Number6/8;//计算第五次计算的商除以8的商

		int oNumber8 = o_Number7%8;//计算第六次计算的商除以8的余数
		int o_Number8 = o_Number7/8;//计算第六次计算的商除以8的商

	
		System.out.println("八进制：" + oNumber8 + oNumber7 + oNumber6 + oNumber5 + oNumber4 + oNumber3 + oNumber2 + oNumber1);
		
		
		//十六进制
		

		int i = 0;

		while(i<8){//计算8位
			int hexNumber = number%16;//取余数
			number = number/16;//取商
			
			if(hexNumber<10){ //判断余数小于10
			
			hexNumber = hexNumber;
			String hexString = "";
			hexString = hexNumber +hexString;
			System.out.print(hexString);
			i++;
			}else{
				String hexString = "";
				if(hexNumber == 10){
					hexString = "A";
				}else if(hexNumber == 11){
					hexString = "B";
				}else if(hexNumber == 12){
					hexString = "C";
				}else if(hexNumber == 13){
					hexString = "D";
				}else if(hexNumber == 14){
					hexString = "E";
				}else if(hexNumber == 15){
					hexString = "F";
				}
				i++;

			System.out.print(hexString);
				}
			
			}
			
		}
			
			
			
			
			
			
			
		}
		
		
		
	}
}