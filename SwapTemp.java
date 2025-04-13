public class SwapTemp {
    public static void main(String[] args){
        int a =2, b=3;
        int temp;
        
        System.out.println("Before Swapping: a : " +a + ", b: " +b);
        
        temp = a;
        a = b;
        b=temp;
        
        System.out.println("After Swapping: a : " +a + ", b: " +b);
        
    }
}

/*
 * 
Before Swapping: a : 2, b: 3
After Swapping: a : 3, b: 2
 */