public class ReverseString2 {
    public static void main(String[] args){
        String word = "Dhanya";
        String reverse = "";
        for(int i = word.length() -1 ; i>=0 ;i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}


//aynahD
