public class Demo{
	
	public static void main(String[] args){
		
		int i = 0;
		int number = 26;
		
		while(i<9){
	
			
			int hexNumber = number%16;//取余数
			number = number/16;//取商
			
			
			
			if(hexNumber<10){
			
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

			System.out.print("十六进制是" + hexString);
			}
			
		
		}
		
	}
}


