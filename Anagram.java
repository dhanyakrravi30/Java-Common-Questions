import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        String str1  = "listen";
        String str2  = "silent";
        
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a, b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
}

//Anagram


/*
if used scanner to get strings, use

 str1.toLowerCase().toCharArray();
 str2.toLowerCase().toCharArray();
 
*/