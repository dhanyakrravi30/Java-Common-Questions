public class ReverseNumRecursion {
    public static int reverse(int number, int rev){
        if(number==0){
            return rev;          
        }
        rev = rev * 10 + (number % 10);
        return  reverse(number/10, rev);
    }
    public static void main(String[]args){
        int number = 145678;
        int result = reverse(number,0);
        System.out.println("Reverse: " +result);
    }
}

//Reverse: 876541 