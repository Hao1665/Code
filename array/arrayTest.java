//½»»»Êý¾Ý
//1 2 3 4 5
public class arrayTest{
	public static void main(String[] args){
		int[] array ={1,2,3,4,5};

		for(int i =0,j=array.length-1;i<j;i++,j--){
			int temp_1 = array[i];
			array[i] = array[j];
			array[j] = temp_1;
		}
		
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}