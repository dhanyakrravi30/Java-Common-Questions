//Library-Function Approach


public class PalindromeStr {
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[]args){
        String str = "Hello";
        System.out.println("Result: " +isPalindrome(str));
    }
}

//Result: false