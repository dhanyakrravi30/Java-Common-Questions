public class StringEqualCaseInsensitive {
    public static void main(String[]args){
        String str1 = "HELLO";
        String str2 = "hello";
        
        if(str1.equalsIgnoreCase(str2)){
              System.out.println("Equal");
        }else{
              System.out.println("Not Equal");
        }
    }
}


//Equal