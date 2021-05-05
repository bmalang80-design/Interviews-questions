package numbers;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Is number even " + check(100));
    }
    private static boolean check(int num){
        return (num % 2) == 0;
    }
}
