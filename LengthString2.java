public class LengthString2{
    public static void main(String[] args){
        String str="Hello";
        int count = 0;
        
        for(char c : str.toCharArray()){
            count++;
        }
        System.out.println("Length of the String:  "+count);
    }
}


//Length of the String: 5