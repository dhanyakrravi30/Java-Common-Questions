public class PerfectSquare {
    public static void main(String[]args){
        int num=4;
        double sqrt = Math.sqrt(num);
        if(sqrt==(int)sqrt){
            System.out.println(num + " is a Perfect Square");
        }else{
            System.out.println(num + " is not a  Perfect Square");
        }
    }
}

//4 is a Perfect Square