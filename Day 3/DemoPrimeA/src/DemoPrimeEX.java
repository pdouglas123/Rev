import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoPrimeEX {

	public static void main(String[] args) {
		int ar[]= {12,33,11,2,344,11,12,11,22,11,11,23,11,44,11,22,11};
		System.out.println("Array elements are: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("\nPrime numbers in above array are : ");
		for (int i = 0; i < ar.length; i++){
			if(isPrime(ar[i])){
				System.out.print(ar[i]+" ");
			}
		}


        //Loop through the array in reverse order
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = ar.length-1; i >= 0; i--){
            System.out.print(ar[i] + " ");
        }
        
        //Delete items from array
        int rm_index = 4;
        System.out.println("\nElement to be removed at index: " + rm_index);
        
        if (ar == null || rm_index < 0
        		|| rm_index >= ar.length) { 
     
        	System.out.println("No removal operation can be performed!!");
        }
        
        int[] proxy_Array = new int[ar.length - 1];
        
        for (int i = 0, k = 0; i < ar.length; i++){ 
        	 
        	if (i == rm_index) { 
        		continue; 
            }
            proxy_Array[k++] = ar[i]; 
        }
 
        System.out.println("Array after removal operation: " + Arrays.toString(proxy_Array));

        //Separate between odd and even
        int separate_array[];
        
        separate_array = separate_Odd_Even(ar);
        System.out.print("Array after separation ");
        System.out.println(Arrays.toString(separate_array));
        
        //Add odd and even
        int Size, i, EvenSum = 0, OddSum = 0;
        
        for(i = 0; i < ar.length; i++) {
        	if(ar[i] % 2 == 0) {
        		EvenSum = EvenSum + ar[i];
        	}else {
        		OddSum = OddSum + ar[i]; 
        	}
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
        System.out.println(" The Sum of Odd Numbers in this Array = " + OddSum);
        
        //Find minimum and maximum
        //converted it to a list and use collections to get the answers
        List<Integer> ints = Arrays.stream(ar).boxed().collect(Collectors.toList());
        System.out.println("Min element is " + Collections.min(ints));
        System.out.println("Max element is " + Collections.max(ints));
        
	}
	
	private static int[] separate_Odd_Even(int[] ar) {
    	int left_Side = 0, right_Side = ar.length - 1;
    	while (left_Side < right_Side) {
    		while (ar[left_Side]%2 == 0 && left_Side < right_Side)
    			left_Side++;
    		
    		while (ar[right_Side]%2 == 1 && left_Side < right_Side)
    			right_Side--;
    		
    		if (left_Side < right_Side) {
    			int temp = ar[left_Side];
    			ar[left_Side] = ar[right_Side];
    			ar[right_Side] = temp;
    			left_Side++;
    			right_Side--;
    		}
    	}
    	return ar;
	}

	public static boolean isPrime(int n){
		boolean b = false;
		int c = 0;
		for (int i = 1; i <= n; i++){
			if (n % i == 0) {
				c++;
			}
		}

		if (c == 2){
			b = true;
		}
		return b;
	}

}