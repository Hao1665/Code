public class dengYao {
    public static void main(String[] args) {
        int rows = 5; // ���������εĸ߶�

        // ���ѭ����������
        for (int i = 1; i <= rows; i++) {
            // ��ӡ�ո�
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // ��ӡ�Ǻ�
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // ÿ�д�ӡ��Ϻ���
            System.out.println();
        }
    }
}
