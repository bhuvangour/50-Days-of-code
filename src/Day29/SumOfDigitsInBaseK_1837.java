package Day29;

public class SumOfDigitsInBaseK_1837 {
	 public static int sumBase(int n, int k) {

	        int sum = 0;
	        while (n > 0) {
	            sum += n % k;
	            n = n / k;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        System.out.println(sumBase(5,6));
	    }
}
