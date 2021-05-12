package numbers;

public class IsPrime {
    public static void main(String[] args) {
        int n = 24;
        System.out.println("Is " + n + " a prime? "+ isPrime(n));
    }
    private static boolean isPrime(int n){
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
