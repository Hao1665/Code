//缝7过 录入1-100之间的数
public class feng7Guo{
	public static void main(String[] args){	
		//1.得出1-100数字
		for(int i = 1;i<=100;i++){
			if(i%7==0 || i%10==7 || i/10%10==7){
				System.out.println("过");
				continue;
			}
			System.out.println(i);	
		}
	}
}