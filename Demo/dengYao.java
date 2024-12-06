public class dengYao {
    public static void main(String[] args) {
        int rows = 5; // 定义三角形的高度

        // 外层循环控制行数
        for (int i = 1; i <= rows; i++) {
            // 打印空格
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // 每行打印完毕后换行
            System.out.println();
        }
    }
}
