import java.util.Scanner;

public class jinZhiZhuanHuan{
	
	public static void main(String[] args){
		System.out.println("���������ַ���ʼ\n����end�˳�");
		Scanner scanner = new Scanner(System.in);
		String end = scanner.next();
		
		
		if (end.equals("end")) {
			
			System.exit(0);
		}else{
			while (true) {
			
			
		//��ʾ�û�����һ��ʮ���Ƶ���
		System.out.println();
		System.out.println("������һ��ʮ���Ƶ����֣�");
		//����ɨ����
		Scanner sc = new Scanner(System.in);
		//�������������
		int number = sc.nextInt();
		
		
		//������
		int binNumber1 = number%2; //������������ֳ���2������
		int bin_Number1 = number/2;//������������ֳ���2����
		
		
		int binNumber2 = bin_Number1%2;//�����һ�μ�����̳���2������
		int bin_Number2 = bin_Number1/2;//�����һ�μ�����̳���2����
		
		
		int binNumber3 = bin_Number2%2;//����ڶ��μ�����̳���2������
		int bin_Number3 = bin_Number2/2;//����ڶ��μ�����̳���2����
		
		
		int binNumber4 = bin_Number3%2;//��������μ�����̳���2������
		int bin_Number4 = bin_Number3/2;//��������μ�����̳���2����
	
		
		int binNumber5 = bin_Number4%2;//������Ĵμ�����̳���2������
		int bin_Number5 = bin_Number4/2;//������Ĵμ�����̳���2����

		int binNumber6 = bin_Number5%2;//������Ĵμ�����̳���2������
		int bin_Number6 = bin_Number5/2;//������Ĵμ�����̳���2����

		int binNumber7 = bin_Number6%2;//�������μ�����̳���2������
		int bin_Number7 = bin_Number6/2;//�������μ�����̳���2����

		int binNumber8 = bin_Number7%2;//��������μ�����̳���2������
		int bin_Number8 = bin_Number7/2;//��������μ�����̳���2����

		System.out.println();
		System.out.println("�����з���ƴ��ʮ��������ֵ");
		System.out.println("�����ƣ�" + binNumber8 + binNumber7 + binNumber6 + binNumber5 + binNumber4 + binNumber3 + binNumber2 + binNumber1);
		
		
		//�˽���
		
		int oNumber1 = number%8; //������������ֳ���8������
		int o_Number1 = number/8;//������������ֳ���8����
		
		
		int oNumber2 = o_Number1%8;//�����һ�μ�����̳���8������
		int o_Number2 = o_Number1/8;//�����һ�μ�����̳���8����
		
		
		int oNumber3 = o_Number2%8;//����ڶ��μ�����̳���8������
		int o_Number3 = o_Number2/8;//����ڶ��μ�����̳���8����
		
		
		int oNumber4 = o_Number3%8;//��������μ�����̳���8������
		int o_Number4 = o_Number3/8;//��������μ�����̳���8����
	
		
		int oNumber5 = o_Number4%8;//������Ĵμ�����̳���8������
		int o_Number5 = o_Number4/8;//������Ĵμ�����̳���8����

		int oNumber6 = o_Number5%8;//������Ĵμ�����̳���8������
		int o_Number6 = o_Number5/8;//������Ĵμ�����̳���8����

		int oNumber7 = o_Number6%8;//�������μ�����̳���8������
		int o_Number7 = o_Number6/8;//�������μ�����̳���8����

		int oNumber8 = o_Number7%8;//��������μ�����̳���8������
		int o_Number8 = o_Number7/8;//��������μ�����̳���8����

	
		System.out.println("�˽��ƣ�" + oNumber8 + oNumber7 + oNumber6 + oNumber5 + oNumber4 + oNumber3 + oNumber2 + oNumber1);
		
		
		//ʮ������
		

		int i = 0;

		while(i<8){//����8λ
			int hexNumber = number%16;//ȡ����
			number = number/16;//ȡ��
			
			if(hexNumber<10){ //�ж�����С��10
			
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