
// USING RECURSION


public class ReverseString3 {
    
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        
         return reverse(str.substring(1))+str.charAt(0);
        
    }
    public static void main(String[] args){
        String original ="Welcome";
        String reversed = reverse(original);
        System.out.println("Original String:  "+original);
        System.out.println("Reversed String: "+reversed);
    }
}

/*
 * Original String:  Welcome
   Reversed String: emocleW
 */