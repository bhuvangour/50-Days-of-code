package Day4;
import java.util.*;
public class numberof1bits {
	 public static int hammingWeight(int n) {

	        int count = 0;
	        while (n != 0) {
	            n = n & (n - 1);    //** as & is true only when both are true
	            count++;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        System.out.println(hammingWeight(n));
	    }
}
