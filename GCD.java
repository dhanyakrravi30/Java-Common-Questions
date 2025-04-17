public class GCD {
    
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[]args){
        int a =36,b =60;
        System.out.println("GCD of a: "+a+ ",b:  " +b + " is: " + gcd(a,b));
    }
}

/*
 * GCD of a: 36,b:60 is: 12
 */