public class LCM {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    
    public static int lcm(int a,int b){
        if(b==0)
            return a;
        return (a*b/gcd(a,b));
    }
    public static void main(String[]args){
        int a = 36, b=60;
        System.out.println("LCM of a: "+ a + ",b: " +b + "is " +lcm(a,b));
        
    }
}

/*
 * 
 * LCM of a: 36,b: 60is 180
 */