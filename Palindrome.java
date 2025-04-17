public class Palindrome {
    public static void main(String[]args){
        int num = 12321,rev =0,r,a;
        a=num;
        
        while(num>0){
            r = num%10;
            rev = rev*10 + r;
            num = num/10;
        }
        
        if(a==rev){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}

//It is a Palindrome
