public class Countoccurence {
    public static void main(String[]args){
        String st =  "Hello";
        char c = 'l';
        int count=0;
        
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)== c){
                count++;
            }
        }
        System.out.println("Th word " +c + " occurs " + count + "times");        
    }
}


//Th word l occurs 2times