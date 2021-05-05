package numbers;

public class CheckPassword {
    public static void main(String[] args) {
        String password = "PittsburghCity9&";
        System.out.println("Is " + password + " strong password? "+ check(password));
    }
    private static boolean check(String password){
        boolean length = password.length() >= 6;
        boolean containsNumber = password.matches(".*[\\d].*");
        boolean containsUpper = password.matches(".*[A-Z].*");
        boolean containLower = password.matches(".*[a-z].*");
        boolean containsSpecial = password.matches(".*[\\p{Punct}].*");

        return length && containsNumber && containsUpper && containLower && containsSpecial;
    }
}
