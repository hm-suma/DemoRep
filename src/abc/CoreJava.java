package abc;

public class CoreJava {

	public static void main(String[] args) {
		// data type -int, float, char, string etc
		//num is variable
		//declaring the number we required datatype
		int num = 5;
		String name = "Sumahm";
		char letter = 'a';
		double decimal = 23.8;
		boolean decission =  true;
		System.out.println(num + " is the value stored in this");
		//variable and string concatenate using +
		System.out.println(name);
		
		//arrays can store multiple values in one variable int[5] assigns memory using new operator
		int[] arr = new int[4];//syntax
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		int[] arr1 = {1,2, 3};
		//System.out.println(arr1[2]+ arr1[4]);// arr1[4] gives out of bound error
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		String[] name1 ={ " suma", " gani", " amma"};
		System.out.println(name1);
		for (String s: name1) {// enhanced for loop
			System.out.println(s);
		}
		}

}
