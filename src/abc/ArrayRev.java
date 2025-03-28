package abc;
import java.util.Arrays;

public class ArrayRev {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,7,9,11,13,14,15,16,18,22};
	    for(int i=0;i<numbers.length;i++){
	        System.out.println(numbers[i]);
	        break;
	    }
	    System.out.println(numbers[numbers.length- 1]);
	
	    for(int s : numbers){
        System.out.println(s + "  ");
        
	}
		int n = numbers.length;
		int[] temp= new int[n];//created a memory using new methods
		for(int i=0;i<n; i++) {
			 temp[i] = numbers[n-i-1];//14-0-1=13, 14-1-1=12, 
			// numbers[i] = temp[i];
			 
			 System.out.println(temp[i] + " ");
		}
		int[] a;
		for(int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	
	}
	}
	    	
	

	    

