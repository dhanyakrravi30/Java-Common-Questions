public class ReverseString1 {
    public static void main(String[] args){
        String word = "Hello";
        String reverse = new StringBuilder(word).reverse().toString();
        System.out.println(reverse);
    }
}


//olleH