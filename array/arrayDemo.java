/*
数组Demo
1.求和
2.求平均数
3.统计有多少个数比平均数小
*/
public class arrayDemo {
    public static void main(String[] args) {
		//定义长度为10的动态数组
		int[] array = new int[10];
		int num = 0;
		int average;
		int counter = 0;
		//遍历获取十次随机数赋值给array0-9索引
		for(int i = 0;i<array.length;i++){
			int random = (int)(Math.random()*100)+1;
			array[i]=random;
		}
		//打印0-9所以元素
		for(int i = 0;i<array.length;i++){
			System.out.println("索引" + i + "的元素是：" + array[i]);
		}
		System.out.println("array" + "[" + array[0] + ',' + array[1] + ',' + array[2] + ',' + array[3] + ',' + array[4] + ',' + array[5] + ',' + array[6] + ',' + array[7] + ',' + array[8] + ',' + array[9] + "]");
		//计算0-9索引元素的和
		for(int i =0;i<array.length;i++){
			num+=array[i];
		}
		System.out.println("和为" + num);
		//计算0-9索引元素的平均数
		average = num/array.length;
		System.out.println("平均数：" + average);
		
		//统计有多少个小于平均数的数
		for(int i =1;i<array.length;i++){
			if(array[i]<average){
				System.out.println(array[i]);
				counter++;
			}
		}
		System.out.println("小于平均数的数有：" + counter + "个");
	}
}
