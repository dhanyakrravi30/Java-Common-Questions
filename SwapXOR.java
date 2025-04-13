public class SwapXOR {
    public static void main(String[] args){
        int a = 8; 
        int b = 7;
        
        System.out.println("Before Swapping : a:  " +a+ ", b: " +b);
        
        a = a^b;
        b =a^b;
        a = a^b;
        
        System.out.println("After Swapping : a:  " +a+ ", b: " +b);
    }
}


/*
 *
Before Swapping : a:  8, b: 7
After Swapping : a:  7, b: 8
 */