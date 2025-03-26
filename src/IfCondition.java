
public class IfCondition {

	public static void main(String[] args) {
		int[] arr1 = {1,2, 3,6,8, 9, 12, 16, 18, 22, 24, 37, 32, 33, 43, 42};
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] % 2 == 0) {
				System.out.println(arr1[i]);
				//break;
		}
		
			else {
				System.out.println(arr1[i] + "is not a multiple of 2");
			}
		}

	}

}
