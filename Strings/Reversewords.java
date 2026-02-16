public class Reversewords{
    public static void main(String args[]){
        eachwordreverse("welcome to java programming");
    }
    static void eachwordreverse(String inputString){
         String []words=inputString.split(" ");
         String reversestring=" ";
         for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev=" ";
            char ch;
            for(int j=0;j<word.length();j++){
                ch=word.charAt(j);
                rev=ch+rev;
            }
            reversestring=rev+reversestring;
        }
        System.out.println(inputString);
        System.out.println(reversestring);
    }
}

