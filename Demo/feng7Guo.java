//��7�� ¼��1-100֮�����
public class feng7Guo{
	public static void main(String[] args){	
		//1.�ó�1-100����
		for(int i = 1;i<=100;i++){
			if(i%7==0 || i%10==7 || i/10%10==7){
				System.out.println("��");
				continue;
			}
			System.out.println(i);	
		}
	}
}