public class OccurenceChar {
    public static void main(String[]args){
        String str="Hello";
        
        for (int i=0; i<str.length();i++){
            char c = str.charAt(i);
            int count=0;
        
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)==c){
                count++;
            }
        }
        System.out.println(c + " = " +count);
        }
    }
}

/*
H = 1
e = 1
l = 2
l = 2
o = 1
/*