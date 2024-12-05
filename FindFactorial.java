public class FindFactorial {

    public static int factorial(int n) {
        if (n==1)
            return 1;
        else 
           return n* factorial(n - 1);   // when calling same method inside that method called recursive method.
    }

    public static void main (String[] args) {
        long result = factorial(10);
        System.out.println("Factorial is " +result);
        
    }
}
 