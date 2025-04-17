public class SumofNaturalNum {
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num + sum(num - 1 );
    }
        
    public static void main(String[]args){
        int num  = 6;
        int result = sum(num);
        System.out.println("Result: " +result);
    }
}

//Result: 21
