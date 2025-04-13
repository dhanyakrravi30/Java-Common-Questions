/*
 * Write a Java program using Scanner to read a string, a word to replace, 
 * and a new word from the user, then print the modified string after 
 * replacing the word.
 */


import java.util.Scanner;
public class ReplaceSubstringConsole {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a String:  ");
        String original = scanner.nextLine();
        
        System.out.println("Enter which word to replace:   ");
        String word = scanner.nextLine();
        
        System.out.println("Enter what word to replace:   ");
        String replace = scanner.nextLine();
        
        String result = original.replace(word,replace);
        System.out.println("Modified String:  " + result);
    }
}


/*
 * 
Enter a String:  
HelloWorld
Enter which word to replace:   
Hello
Enter what word to replace:   
Hi
Modified String:  HiWorld
 */