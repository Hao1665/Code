/*
����Demo
1.���
2.��ƽ����
3.ͳ���ж��ٸ�����ƽ����С
*/
public class arrayDemo {
    public static void main(String[] args) {
		//���峤��Ϊ10�Ķ�̬����
		int[] array = new int[10];
		int num = 0;
		int average;
		int counter = 0;
		//������ȡʮ���������ֵ��array0-9����
		for(int i = 0;i<array.length;i++){
			int random = (int)(Math.random()*100)+1;
			array[i]=random;
		}
		//��ӡ0-9����Ԫ��
		for(int i = 0;i<array.length;i++){
			System.out.println("����" + i + "��Ԫ���ǣ�" + array[i]);
		}
		System.out.println("array" + "[" + array[0] + ',' + array[1] + ',' + array[2] + ',' + array[3] + ',' + array[4] + ',' + array[5] + ',' + array[6] + ',' + array[7] + ',' + array[8] + ',' + array[9] + "]");
		//����0-9����Ԫ�صĺ�
		for(int i =0;i<array.length;i++){
			num+=array[i];
		}
		System.out.println("��Ϊ" + num);
		//����0-9����Ԫ�ص�ƽ����
		average = num/array.length;
		System.out.println("ƽ������" + average);
		
		//ͳ���ж��ٸ�С��ƽ��������
		for(int i =1;i<array.length;i++){
			if(array[i]<average){
				System.out.println(array[i]);
				counter++;
			}
		}
		System.out.println("С��ƽ���������У�" + counter + "��");
	}
}
