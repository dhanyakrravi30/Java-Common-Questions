public class SwapTwo {
    public static void main(String[] args){
        int a = 4;
        int b =8;
        
       System.out.println("Before Swapping:  a: " +a + ", b: " +b);
       
       a = a+b;
       b = a-b;
       a = a-b;
       
       System.out.println("After Swapping:  a: " +a + ", b: " +b);
       
    }
    
}

/*
 *
Before Swapping:  a: 4, b: 8
After Swapping:  a: 8, b: 4
 */