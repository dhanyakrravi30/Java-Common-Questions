public class ReverseNum {
    public static void main(String[] args){
        int num = 123456, rev=0,r,a;
        a = num;
        
        while(num>0){
            r = num%10;
            rev = rev*10 + r;
            num = num/10;
        }
        System.out.println("Reverse of a Number: " +rev);
    }
    
}

/*
 * Reverse of a Number: 654321
 */