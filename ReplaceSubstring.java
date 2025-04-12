/*
 * Write a Java program to replace the substring "Hello" with "Hi" 
 * in the string "HelloWorld" and print the result.
 */

 public class ReplaceSubstring {
    public static void main(String[] args){
        String message = "HelloWorld";
        String modified = message.replace("Hello","Hi");
        System.out.println(modified);
    }
}


/*Output
 * HiWorld
 */