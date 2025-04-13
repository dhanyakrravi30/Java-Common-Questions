public class FibonacciSeries {
    public static void main(String[] args){
        int number = 6;
        int first = 0, second =1, next;
        System.out.print("Fibonacci Series:  ");
        
        for(int i = 0; i<number; i++){
            System.out.print(first + " ");
            next = second +first;
            first = second;
            second = next;
        }
    }
}
/*
 * Fibonacci Series:  0 1 1 2 3 5
 */