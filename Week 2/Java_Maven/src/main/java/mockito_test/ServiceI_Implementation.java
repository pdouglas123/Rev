package mockito_test;

public class ServiceI_Implementation implements Service{

	public long doubleLong(long num) {
        return 2 * num;
    }
 
    public long tripleLong(long num) {
        return 3 * num;
    }
 
    public long addition(long... nums) {
        int sum = 0;
        for (long a : nums) sum += a;
        return sum;
    }

}
