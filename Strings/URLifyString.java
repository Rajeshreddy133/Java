import java.util.Scanner;
class URLifyString{
    public static String URLify(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x==' '){
                sb.append("%20");
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(URLify(s));
    }
}