import java.util.Scanner;
class VowelsAndConsonents{
    static void checkString(String s) {
        int v = 0;
        int c = 0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
              v++;
            }
            else{
               c++;
            }
        }
        System.out.println("Vowels Count : "+v);
        System.out.println("Consonents Count :"+c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        checkString(s);
    }
}