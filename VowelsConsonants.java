public class VowelsConsonants {
    public static String consonantvowel(String str){
        int vowel = 0, consonant = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u'){
                    vowel++; }
                else{
            consonant++;
                }
            }
        } 
        return "Vowels: " + vowel + "\nConsonants: " + consonant;                
    }
    public static void main(String[]args){
        String input = "Hello";
        System.out.println(consonantvowel(input));
    }
}

//Vowels: 2
//Consonants: 3
