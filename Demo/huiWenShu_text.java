//������

import java.util.Scanner;
public class huiWenShu_test{
	public static void main(String[] args){
		
		System.out.println("������һ�����֣�");//��ӡ����
		Scanner sc = new Scanner(System.in);//����ɨ���Ƕ���
		int inputNum = sc.nextInt();//����ɨ���ǵ�������
		int temp = inputNum;//����������ִ浽��ʱ����temp��
		int num = 0;//�������num�������
		//123
		while(inputNum!=0){
			int ge = inputNum%10;//��ȡ���������ÿһλ����
			inputNum = inputNum / 10;
			num = num *10+ge;//��ȡ������
			
		}
			System.out.println(temp==num);//�ж��Ƿ���ȣ��Ƿ�Ϊ������
	}
}