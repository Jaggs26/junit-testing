package q5;

public class LifeCycle {

    public int[] array;
    public int n;

    public int arraySum(){
        int sum = 0;
        int n = array.length;

        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }
    int multiply(int a, int b) {
    	return a*b;
    }

  
}
