import java.util.Scanner;

public class dengLu{
	
	public static void main(String[] args){
		
		
		//�����˺�����
		String zhang_Hao = "123";
		String mi_Ma = "123";
		Scanner sc = new Scanner(System.in);
		
		
		//��ʾ
		System.out.println("���������Ա�˺�����");
		//�û������˺�
		System.out.print("�˺ţ�");
		String shu_Ru_Zhang_Hao = sc.next();
		//�û���������
		System.out.print("���룺");
		String shu_Ru_Mi_Ma = sc.next();
		//�ж��û�������˺������Ƿ���ȷ����ȷ�ͼ���ִ�У����������
		if(shu_Ru_Zhang_Hao.equals("123") && shu_Ru_Mi_Ma.equals("123")){
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("* * * * * * * �û���Ϣ¼��ϵͳ * * * * * *");
			System.out.println("*\t\t\t\t\t *");
			//�û���������
			System.out.print("* �������������:\t\t\t *");
			System.out.print("\r\t\t"+"��");
			String user_Name = scanner.next();
			//�û���������
			System.out.print("* �������������:\t\t\t *");
			System.out.print("\r\t\t"+"��");
			int user_Age = scanner.nextInt();
			//�û������Ա�
			System.out.print("* ����������Ա�:\t\t\t *");
			System.out.print("\r\t\t"+"��");
			char user_Sex = scanner.next().charAt(0);
			//�ı��ѱ���
			System.out.println("*\t\t\t\t\t *");
			System.out.println("* �ѱ���������Ϣ��\t\t\t *");
			
			
			
			
			
			
			//������
			System.out.println("*\t\t\t\t\t *");
			System.out.println("* * * * * * * * * * ���� * * * * * * * * *");
			
			}
		else {
			System.out.println("�˺Ż������������");
			System.exit(0);
			
		}
		
	}
}